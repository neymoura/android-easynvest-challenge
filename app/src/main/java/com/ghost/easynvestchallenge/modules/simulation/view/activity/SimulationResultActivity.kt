package com.ghost.easynvestchallenge.modules.simulation.view.activity

import android.os.Bundle
import com.ghost.easynvestchallenge.R
import com.ghost.easynvestchallenge.core.view.activity.BaseActivity
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult

class SimulationResultActivity : BaseActivity() {

    companion object {
        const val simulationResult = "simulationResult"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulation_result)
        setupHomeButton()

        val simulationResult = intent.extras.get(simulationResult) as? SimulationResult

        simulationResult?.let {
            it.annualGrossRateProfit
        }

    }

}
