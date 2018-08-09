package com.ghost.easynvestchallenge.modules.simulation.model

import java.io.Serializable

class SimulationResult: Serializable {
    val investmentParameter: Investment? = null
    val grossAmount: Double? = null
    val taxesAmount: Double? = null
    val netAmount: Double? = null
    val grossAmountProfit: Double? = null
    val netAmountProfit: Double? = null
    val annualGrossRateProfit: Double? = null
    val monthlyGrossRateProfit: Double? = null
    val dailyGrossRateProfit: Double? = null
    val taxesRate: Double? = null
    val rateProfit: Double? = null
    val annualNetRateProfit: Double? = null
}
