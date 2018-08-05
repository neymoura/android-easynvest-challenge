package com.ghost.easynvestchallenge.modules.simulation.business

import com.ghost.easynvestchallenge.modules.simulation.entity.SimulationResult
import com.ghost.easynvestchallenge.modules.simulation.network.SimulationNetwork

object SimulationBusiness {

    fun simulateInvestment(investedAmount: Double,
                           index: String,
                           rate: Int,
                           isTaxFree: Boolean,
                           maturityDate: String,
                           onSuccess: (SimulationResult) -> Unit,
                           onFailure: () -> Unit){

        SimulationNetwork.simulate(investedAmount, index, rate, isTaxFree, maturityDate, {
            onSuccess(it)
        },{
            onFailure()
        })

    }

}