package com.aristidevs.estudiocompleto.TestUnitarios.JUnit

import org.junit.Assert.assertEquals
import org.junit.Test

class CalculatorTest {

    @Test
    fun testAddition() {
        // Configuración
        val calculator = Calculator()

        // Ejecución
        val result = calculator.add(2, 3)

        // Aserción
        assertEquals(5, result)
    }
}
