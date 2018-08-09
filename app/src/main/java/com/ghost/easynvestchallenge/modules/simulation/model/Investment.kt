package com.ghost.easynvestchallenge.modules.simulation.model

import java.io.Serializable

class Investment: Serializable {
    val investedAmount: Double? = null
    val yearlyInterestRate: Double? = null
    val maturityTotalDays: Int? = null
    val maturityBusinessDays: Int? = null
    val maturityDate: String? = null
    val rate: Double? = null
    val isTaxFree: Boolean? = null
}