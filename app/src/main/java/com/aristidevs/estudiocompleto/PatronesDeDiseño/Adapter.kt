package com.aristidevs.estudiocompleto.PatronesDeDiseño


//Patron de Diseño Adapter
// El patron de diseño Adapter permite que interfaces incompatibles trabajen juntas.
// Se utiliza para unir sistemas que de otra manera no podrian colaborar.

// Adaptee
class Adaptee{
    fun specificRequest(): String = "Specific request"
}

// Target
interface Target {
    fun request(): String
}

// Adapter
class Adapter(private val adaptee: Adaptee) : Target {
    override fun request(): String {
        return "Adapter: ${adaptee.specificRequest()}"
    }
}

// Uso
val adaptee = Adaptee()
val adapter = Adapter(adaptee)

//println(adapter.request())  // Debería imprimir: Adapter: Specific request
