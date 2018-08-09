package com.ghost.easynvestchallenge.modules.simulation.network

import com.ghost.easynvestchallenge.core.network.BaseNetwork
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

object SimulationNetwork : BaseNetwork() {

    private val simulationAPI: SimulationAPI by lazy {
        this.getRetrofitBuilder().build().create(SimulationAPI::class.java)
    }

    fun simulate(investedAmount: Double,
                 index: String,
                 rate: Int,
                 isTaxFree: Boolean,
                 maturityDate: String,
                 onSuccess: (SimulationResult) -> Unit,
                 onFailure: () -> Unit){

        simulationAPI.simulate(investedAmount, index, rate, isTaxFree, maturityDate)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ simulationResult ->

                    if(simulationResult != null){
                        onSuccess(simulationResult)
                    }else{
                        onFailure()
                        return@subscribe
                    }

                }, {
                    onFailure()
                })

    }

}