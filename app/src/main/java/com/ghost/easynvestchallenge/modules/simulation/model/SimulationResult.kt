package com.ghost.easynvestchallenge.modules.simulation.model

import java.io.Serializable

class SimulationResult(val investmentParameter: Investment?,
                       val grossAmount: Double?,
                       val taxesAmount: Double?,
                       val netAmount: Double?,
                       val grossAmountProfit: Double?,
                       val netAmountProfit: Double?,
                       val annualGrossRateProfit: Double?,
                       val monthlyGrossRateProfit: Double?,
                       val dailyGrossRateProfit: Double?,
                       val taxesRate: Double?,
                       val rateProfit: Double?,
                       val annualNetRateProfit: Double?): Serializable
