package com.aristidevs.estudiocompleto.PatronesDeDiseño

//Patron de Diseño Strategy

// Define una familia de algoritmos, encapsula cada uno de ellos y los hace intercambiables.
//Permite que el cliente elija el algoritmo que desea utilizar.

// Strategy
interface PaymentStrategy {
    fun pay(amount: Double)
}

// Concrete Strategies
class CreditCardPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using credit card")
    }
}

class PayPalPayment : PaymentStrategy {
    override fun pay(amount: Double) {
        println("Paid $amount using PayPal")
    }
}

// Context
class ShoppingCart(private val paymentStrategy: PaymentStrategy) {
    fun checkout(amount: Double) {
        paymentStrategy.pay(amount)
    }
}

// Uso
val creditCardPayment = CreditCardPayment()
val payPalPayment = PayPalPayment()

val shoppingCart1 = ShoppingCart(creditCardPayment)
val shoppingCart2 = ShoppingCart(payPalPayment)

//shoppingCart1.checkout(100.0)  // Debería imprimir: Paid 100.0 using credit card
//shoppingCart2.checkout(50.0)   // Debería imprimir: Paid 50.0 using PayPal
