package com.ghost.easynvestchallenge.core.extension

import java.text.SimpleDateFormat
import java.util.*

fun Date.format(mask: String = "dd/MM/yyyy") =
        SimpleDateFormat(mask, Locale.getDefault()).format(this)

fun Date.formatReverse() =
        this.format("yyyy-MM-dd")