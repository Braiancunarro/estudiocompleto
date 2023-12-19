package com.aristidevs.estudiocompleto.PatronesDeDiseño


//Patron Builder
// Separa la construccion de un objeto complejo de su representacion, de modo que el mismo proceso
// de construccion pueda crear diferentes representaciones.

class Product private constructor(
    val part1: String?,
    val part2: String?,
    val part3: String?
) {
    data class Builder(
        var part1: String? = null,
        var part2: String? = null,
        var part3: String? = null
    ) {
        fun build(): Product {
            return Product(part1, part2, part3)
        }
    }
}

//// Uso
//val product = Product.Builder()
//    .part1("A")
//    .part2("B")
//    .build()
