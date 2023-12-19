package com.aristidevs.estudiocompleto.PrincipiosSolid.OpenClosePrinciple


//Principio abierto/cerrado

//este principio establece que tu clase debe estar abierta para extension,
//pero cerradas para modificacion.

//class Rectangulo {
//    var alto:Double = 0.0
//    var ancho:Double = 0.0
//}
//
//class Triangulo{
//    var base:Double = 0.0
//    var altura: Double = 0.0
//}
//
//class calculadoraArea<T>{
//
//    fun calcularArea(figura:T):Double{
//        val area = when(figura){
//            is Rectangulo -> {
//                figura.ancho + figura.alto
//            }
//            is Triangulo -> {
//                figura.base + figura.altura
//            }
//            else -> {0.0}
//        }
//        return area
//    }
//}

//Esto está mal ya que de esta manera si inicializamos mas figuras, deberiamos modificar el calcularArea

//Lo correcto en esta parte es inicializar una interface, que contenga classes con sus debidas funciones.
//
//        interface Figura{
//            fun calcularArea():Double
//        }
//
//    class Rectangulo: Figura {
//        var alto:Double = 0.0
//        var ancho:Double = 0.0
//        override fun calcularArea() = alto+ancho
//    }
//
//class Triangulo: Figura {
//    var base:Double = 0.0
//    var altura:Double = 0.0
//    override fun calcularArea() = base+altura
//}
//
// esta manera es la correcta, ya que esta abierta la funcion, pero no para la modificación.