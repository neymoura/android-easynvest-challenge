package com.ghost.easynvestchallenge

import com.ghost.easynvestchallenge.core.extension.*
import junit.framework.Assert.assertEquals
import org.junit.Test

class FormatTest {

    @Test
    fun dateFormatReverse() {

        val input = "25/12/2023"
        val output = input.toDate().formatReverse()

        val expectedOutput = "2023-12-25"

        assertEquals(expectedOutput, output)

    }

    @Test
    fun dateParseWithTime() {

        val input = "2019-08-07T00:00:00"
        val output = input.toDateWithTime().format()

        val expectedOutput = "07/08/2019"

        assertEquals(expectedOutput, output)

    }

    @Test
    fun doubleCurrencyFormat() {

        val input = 150000000.90
        val output = input.formatCurrency()

        val expectedOutput = "R$ 150.000.000,90"

        assertEquals(expectedOutput, output)

    }

}