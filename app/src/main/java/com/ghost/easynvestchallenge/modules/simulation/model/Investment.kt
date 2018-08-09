package com.ghost.easynvestchallenge.modules.simulation.model

import java.io.Serializable

class Investment(val investedAmount: Double?,
                 val yearlyInterestRate: Double?,
                 val maturityTotalDays: Int?,
                 val maturityBusinessDays: Int?,
                 val maturityDate: String?,
                 val rate: Double?,
                 val isTaxFree: Boolean?): Serializable
