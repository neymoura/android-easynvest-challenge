package com.ghost.easynvestchallenge.core.extension

import java.text.SimpleDateFormat
import java.util.*

fun String.toDate(mask: String = "dd/MM/yyyy"): Date =
        SimpleDateFormat(mask, Locale.getDefault()).parse(this)

fun String.toDateWithTime(): Date =
        this.toDate("yyyy-MM-dd'T'HH:mm:ss")