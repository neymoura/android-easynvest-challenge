package com.ghost.easynvestchallenge.modules.simulation.viewModel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.ghost.easynvestchallenge.R
import com.ghost.easynvestchallenge.core.extension.formatReverse
import com.ghost.easynvestchallenge.core.extension.toDate
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult
import com.ghost.easynvestchallenge.modules.simulation.network.SimulationNetwork

class SimulationViewModel : ViewModel() {

    val simulationResult = MutableLiveData<SimulationResult>()
    val userFeedback = MutableLiveData<Int>()

    fun simulate(investedAmountInput: String,
                 indexInput: String = "CDI",
                 rateInput: String,
                 isTaxFreeInput: Boolean = false,
                 maturityDateInput: String) {

        try{

            val investedAmount = investedAmountInput.toDoubleOrNull() ?: 0.0
            val rate = rateInput.toIntOrNull() ?: 0
            val maturityDate = maturityDateInput.toDate().formatReverse() ?: ""

            fetchSimulation(investedAmount, indexInput, rate, isTaxFreeInput, maturityDate)

        }catch (e: Exception){
            userFeedback.value = R.string.something_went_wrong
        }

    }

    private fun fetchSimulation(investedAmount: Double, indexInput: String, rate: Int, isTaxFreeInput: Boolean, maturityDate: String) {

        SimulationNetwork.simulate(investedAmount,
                indexInput,
                rate,
                isTaxFreeInput,
                maturityDate,
                { simulationResultResponse ->
                    simulationResult.value = simulationResultResponse
                }, {
                    userFeedback.value = R.string.something_went_wrong
                }
        )

    }

}