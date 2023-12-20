package com.aristidevs.estudiocompleto.TestUnitarios.Mockito

class Calculator(private val mathOperation: MathOperation) {
    fun addAndSubtract(x: Int, y: Int): Pair<Int, Int> {
        val sum = mathOperation.add(x, y)
        val difference = mathOperation.subtract(x, y)
        return Pair(sum, difference)
    }
}