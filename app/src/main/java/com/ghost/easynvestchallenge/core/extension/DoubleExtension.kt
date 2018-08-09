package com.ghost.easynvestchallenge.core.extension

import java.text.DecimalFormat
import java.util.*

fun Double.formatCurrency(locale: Locale = Locale("pt","br")): String? =
        DecimalFormat.getCurrencyInstance(locale).format(this)