package com.ghost.easynvestchallenge.modules.simulation.presenter

import com.ghost.easynvestchallenge.core.extension.format
import com.ghost.easynvestchallenge.core.extension.formatCurrency
import com.ghost.easynvestchallenge.core.extension.formatPercent
import com.ghost.easynvestchallenge.core.extension.toDateWithTime
import com.ghost.easynvestchallenge.modules.simulation.model.SimulationResult

class SimulationResultPresenter(simulationResult: SimulationResult) {

    var investedAmount: String = ""
    var grossAmount: String = ""
    var grossAmountProfit: String = ""
    var taxes: String = ""
    var netAmount: String = ""
    var maturityDate: String = ""
    var maturityTotalDays: String = ""
    var monthlyGrossRateProfit: String = ""
    var rate: String = ""
    var annualGrossRateProfity: String = ""
    var rateProfit: String = ""

    init {

        investedAmount = simulationResult.investmentParameter?.investedAmount?.formatCurrency() ?: "-"
        grossAmount = simulationResult.grossAmount?.formatCurrency() ?: "-"
        grossAmountProfit = simulationResult.grossAmountProfit?.formatCurrency() ?: "-"

        val taxesAmount = simulationResult.taxesAmount?.formatCurrency() ?: "-"
        val taxesRate = simulationResult.taxesRate?.formatPercent() ?: "-"
        taxes = "$taxesAmount ($taxesRate)"

        netAmount = simulationResult.netAmount?.formatCurrency() ?: "-"
        maturityDate = simulationResult.investmentParameter?.maturityDate?.toDateWithTime()?.format() ?: "-"
        maturityTotalDays = simulationResult.investmentParameter?.maturityTotalDays?.toString() ?: "-"
        monthlyGrossRateProfit = simulationResult.monthlyGrossRateProfit?.formatPercent() ?: "-"
        rate = simulationResult.investmentParameter?.rate?.formatPercent() ?: "-"
        annualGrossRateProfity = simulationResult.annualGrossRateProfit?.formatPercent() ?: "-"
        rateProfit = simulationResult.rateProfit?.formatPercent() ?: "-"

    }

}