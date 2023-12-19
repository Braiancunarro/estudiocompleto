package com.aristidevs.estudiocompleto.PatronesDeDiseño


//Patron de diseño Factory

//El patron Factory se utiliza para crear objetos sin especificar la clase exacta del objeto que se creará.


//interface Product {
//    fun getDescription(): String
//}
//
//class ConcreteProductA : Product {
//    override fun getDescription(): String = "Product A"
//}
//
//class ConcreteProductB : Product {
//    override fun getDescription(): String = "Product B"
//}
//
//class ProductFactory {
//    fun createProduct(type: String): Product {
//        return when (type) {
//            "A" -> ConcreteProductA()
//            "B" -> ConcreteProductB()
//            else -> throw IllegalArgumentException("Invalid product type")
//        }
//    }
//}
//
//// Uso
//val factory = ProductFactory()
//val productA = factory.createProduct("A")
//val productB = factory.createProduct("B")
//
//println(productA.getDescription())  // Debería imprimir: Product A
//println(productB.getDescription())  // Debería imprimir: Product B


class Factory(){}