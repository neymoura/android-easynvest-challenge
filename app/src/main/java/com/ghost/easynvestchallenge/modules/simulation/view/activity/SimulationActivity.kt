package com.ghost.easynvestchallenge.modules.simulation.view.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.ghost.easynvestchallenge.R
import com.ghost.easynvestchallenge.core.view.activity.BaseActivity
import com.ghost.easynvestchallenge.modules.simulation.viewModel.SimulationViewModel
import kotlinx.android.synthetic.main.activity_simulation.*
import org.jetbrains.anko.design.snackbar
import org.jetbrains.anko.startActivity

class SimulationActivity : BaseActivity() {

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimulationViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulation)
        setup()
    }

    private fun setup() {

        runSimulationButton.setOnClickListener {
            simulate()
        }

        viewModel.simulationResult.observe(this, Observer { simulationResult ->
            simulationResult?.let {
                startActivity<SimulationResultActivity>(
                        SimulationResultActivity.simulationResult to simulationResult
                )
            }
        })

        viewModel.userFeedback.observe(this, Observer { messageRes ->
            messageRes?.let {
                snackbar(constraintLayout, messageRes)
            }
        })

    }

    private fun simulate() {

        val investmentAmountInput = investment_amount_input.text.toString()
        val dueDateInput = due_date_input.text.toString()
        val indexRateInput = index_rate_input.text.toString()

        viewModel.simulate(investedAmountInput = investmentAmountInput,
                maturityDateInput = dueDateInput,
                rateInput = indexRateInput)

    }

}
