package com.aristidevs.estudiocompleto.PrincipiosSolid.SingleResponsabilityPrinciple


//Principio de responsabilidad unica
//Una clase solo puede tener una tarea.

//class Circulo(val radio:Double) {
//
//    fun calcularArea(): Double {
//        return Math.PI * radio * radio
//    }
//
//    fun calcularPerimetro(): Double{
//        return 2 * Math.PI * radio
//    }
//    }
//aqui arriba no se estaria cumpliendo el principio de responsabilidad unica,
//ya que circulo tiene dos funciones anidadas dentro de la clase.

class CarcularareaCirculo(private val radio: Double) {
    fun cacularArea(): Double {
        return Math.PI * radio * radio
    }
}

class CalcularPerimetro(private val radio: Double) {
    fun calcularPerimetroCirculo(): Double {
        return 2 * Math.PI * radio
    }
}

//De esta manera cada clase tiene una tarea,  y cumplimos con el principio.
