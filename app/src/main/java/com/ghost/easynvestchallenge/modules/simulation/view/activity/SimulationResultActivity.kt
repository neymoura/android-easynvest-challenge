package com.ghost.easynvestchallenge.modules.simulation.view.activity

import android.os.Bundle
import com.ghost.easynvestchallenge.R
import com.ghost.easynvestchallenge.core.view.activity.BaseActivity

class SimulationResultActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_simulation_result)
        setupHomeButton()
    }

}
