package com.ghost.easynvestchallenge.core.extension

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(mask: String = "dd/MM/yyyy"): String? =
        SimpleDateFormat(mask, Locale.getDefault()).format(this)

fun Date.formatReverse(): String? =
        this.format("yyyy-MM-dd")