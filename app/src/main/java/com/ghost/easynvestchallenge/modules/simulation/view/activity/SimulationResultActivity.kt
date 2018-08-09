package com.ghost.easynvestchallenge.modules.simulation.view.activity

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import com.ghost.easynvestchallenge.R
import com.ghost.easynvestchallenge.core.view.activity.BaseActivity
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult
import com.ghost.easynvestchallenge.modules.simulation.presenter.SimulationResultPresenter
import com.ghost.easynvestchallenge.modules.simulation.viewModel.SimulationResultViewModel
import kotlinx.android.synthetic.main.activity_simulation_result.*

class SimulationResultActivity : BaseActivity() {

    companion object {
        const val simulationResult = "simulationResult"
    }

    private val viewModel by lazy {
        ViewModelProviders.of(this).get(SimulationResultViewModel::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulation_result)
        setupHomeButton()
        setup()
    }

    private fun setup() {
        val simulationResult = intent.extras.get(simulationResult) as? SimulationResult

        viewModel.simulationResultPresenter.observe(this, Observer {
            it?.let {
                bind(it)
            }
        })

        simulationResult?.let {
            viewModel.setSimulation(it)
        }

        simulateAgain.setOnClickListener {
            onBackPressed()
        }
    }

    private fun bind(presenter: SimulationResultPresenter) {
        investedAmountValue.text         = presenter.investedAmount
        grossAmountValue.text            = presenter.grossAmount
        grossAmountValueBig.text         = presenter.grossAmount
        netAmountValue.text              = presenter.netAmount
        maturityDateValue.text           = presenter.maturityDate
        maturityTotalDaysValue.text      = presenter.maturityTotalDays
        monthlyGrossRateProfitValue.text = presenter.monthlyGrossRateProfit
        rateValue.text                   = presenter.rate
        annualNetRateProfitValue.text    = presenter.annualNetRateProfit
        rateProfitValue.text             = presenter.annualNetRateProfit
    }

}
