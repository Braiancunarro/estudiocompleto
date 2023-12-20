package com.aristidevs.estudiocompleto.TestUnitarios.Mockito

import org.junit.Test

//class CalculatorTest {
//
//    @Test
//    fun testAddAndSubtract() {
//
//        // Configuración del mock
//        val mathOperationMock = mock(MathOperation::class.java)
//        `when`(mathOperationMock.add(2, 3)).thenReturn(5)
//        `when`(mathOperationMock.subtract(2, 3)).thenReturn(-1)
//
//        // Creación del objeto a probar con el mock
//        val calculator = Calculator(mathOperationMock)
//
//        // Ejecución del método a probar
//        val result = calculator.addAndSubtract(2, 3)
//
//        // Verificación de interacciones y resultados
//        verify(mathOperationMock).add(2, 3)
//        verify(mathOperationMock).subtract(2, 3)
//        assertEquals(Pair(5, -1), result)
//    }
//}
