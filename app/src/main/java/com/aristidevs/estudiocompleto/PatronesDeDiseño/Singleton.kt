package com.aristidevs.estudiocompleto.PatronesDeDiseño

import androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.instance

//Patron Singleton
//Asegura que una clase tenga una unica instancia y proporciona un punto de acceso global a ella.


class MySingleton private constructor() {
    // Propiedades y métodos de la clase


    //un objeto de compañia que contiene la logica del singleton
    companion object {
        //se utiliza para garantizar que la instancia sea siempre leida desde la memoria principal, evitando
        //problemas de concurrencia.
        @Volatile
        private var instance: MySingleton? = null
        //Metodo estatico que devuelve la unica instancia de la clase.
        fun getInstance(): MySingleton {
            return instance ?: synchronized(this) {
                instance ?: MySingleton().also { instance = it }
            }
        }
    }
}

// Uso
val singletonInstance1 = MySingleton.getInstance()
val singletonInstance2 = MySingleton.getInstance()

fun igualdad(){
    singletonInstance1 === singletonInstance2
}// deberia retornar true

