package com.aristidevs.estudiocompleto.PrincipiosSolid.LiskovSubstitutionPrinciple

//Este principio dice que cualquier hijo que base de clase padre, puede sustituir
// en cualquier momento a la clase padre.
//si una clase A es una subclase de B, se debe poder utilizar un objeto de la Clase A
//en cualquier lugar donde se espera un objeto de la clase B, sin que el programa deje de funcionar correctamente.


interface Vehiculo {
    fun acelerar()
    fun frenar()
    fun estacionar()
    fun despegar()
    fun aterrizar()
}

class Motocicleta:Vehiculo{
    override fun acelerar() {}
    override fun frenar() {}
    override fun estacionar() {}
    override fun despegar() {throw Exception("Las motocicletas no despegan")}
    override fun aterrizar() {throw Exception("Las motocicletas no aterrizan")}
}

// en este caso una motocicleta no puede sustituir a cualquier vehiculo, por ende se rompe este principio,
// ya que las motocicletas no despegan ni aterrizan.

class Avion:Vehiculo{
    override fun acelerar() {}
    override fun frenar() {}
    override fun estacionar() {}
    override fun despegar() {}
    override fun aterrizar() {}
}

// en este caso un avion puede sustituir a un vehiculo, ya que posee la totalidad de las funciones de la clase padre.
// porque cumplen con la totalidad de las funciones.

//pero para su correcto funcionamiento lo que hacemos es:
//

interface Acelerar{
    fun acelerar()
}
interface Frenar{
    fun frenar()
}
interface Estacionar{
    fun estacionar()
}
interface Despegar{
    fun despegar()
}
interface Aterrizar{
    fun aterrizar()
}

// de esta manera, cada vehiculo tendra sus correspondientes funciones, y van a poder derivadas de cada una de ellas,
//ejemplo :

class motocicleta: Acelerar, Frenar, Estacionar{
    override fun acelerar() {}

    override fun estacionar() {}

    override fun frenar() {}
}
