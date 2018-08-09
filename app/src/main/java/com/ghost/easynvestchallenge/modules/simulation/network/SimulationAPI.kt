package com.ghost.easynvestchallenge.modules.simulation.network

import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult
import io.reactivex.Observable
import retrofit2.http.GET
import retrofit2.http.Query

interface SimulationAPI {

    @GET("calculator/simulate")
    fun simulate(@Query("investedAmount") investedAmount: Double,
                 @Query("index") index: String,
                 @Query("rate") rate: Int,
                 @Query("isTaxFree") isTaxFree: Boolean,
                 @Query("maturityDate") maturityDate: String): Observable<SimulationResult>

}