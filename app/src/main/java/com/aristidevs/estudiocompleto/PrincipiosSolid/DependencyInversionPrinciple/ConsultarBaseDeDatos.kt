package com.aristidevs.estudiocompleto.PrincipiosSolid.DependencyInversionPrinciple

//El principio de inversion de dependencias
// Las dependencias deben estar dirigidas hacia abstracciones, no hacia implementaciones concretas.
//se divide en dos partes
// ***Modulos de alto nivel no deben dependen de modulos de bajo nivel:
// Ambos deben depender de abstracciones, esto significa que las clases de alto nivel(contienen la logica del negocio)
// no deben depender directamente de las clases de bajo nivel(detalles de implementacion),
//sino de abstracciones o interfaces.
//***Abstracciones no deben depender de detalles:
//las abstracciones como interfaces o clases abstractas, no deben depender de detalles de implementacion.
//las interfaces deben ser estables y no deben cambiar cuando cambian los detalles internos de las clases que
//las implementan.
//la idea fundamental es reducir el acoplamiento entre modulos y que el sistema sea mas legible y facil de mantener.
//un ejemplo comun es el uso de las inyecciones de dependencias, para proporcionar las dependencias requeridas
//a una clase en lugar de que la clase las cree directamente.

class ConsultarBaseDeDatos {
    fun obtenerDatos(){}
}

class Main{
    val mConsultarBaseDeDatos = ConsultarBaseDeDatos()
    fun inicio(){
        mConsultarBaseDeDatos.obtenerDatos()
    }
}
//Acá se rompe el principio porque estamos dependiendo de una clase mas pequeña, y no de una abstraccion,como
//indica el principio.

//la resolucion es :

interface obtenerDatos{
    fun obtenerDatos()
}

class consultarBaseDeDatos : obtenerDatos{
    override fun obtenerDatos() {
        //logica para obtener datos
    }

    class Main{
        fun inicio(mConsultarBaseDeDatos: obtenerDatos){
            mConsultarBaseDeDatos.obtenerDatos()
        }
    }
}