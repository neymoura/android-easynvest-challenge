package com.ghost.easynvestchallenge.modules.simulation.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult
import com.ghost.easynvestchallenge.modules.simulation.presenter.SimulationResultPresenter

class SimulationResultViewModel: ViewModel() {

    val simulationResultPresenter = MutableLiveData<SimulationResultPresenter>()

    fun setSimulation(simulationResult: SimulationResult){
        simulationResultPresenter.value = SimulationResultPresenter(simulationResult)
    }

}