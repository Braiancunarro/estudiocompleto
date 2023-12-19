package com.aristidevs.estudiocompleto.Corrutinas;


//CORRUTINAS

//las corrutinas facilitan la concurrencia y manejo asincrono en el codigo, de una manera sencilla y eficiente.
//ofrecen algunas caracteristicas:

//Ligereza: Son mas ligeras que los hilos tradicionales, y puedes tener miles en ejecucion sin preocuparte por
// el agotamiento de recursos.

//sintaxis concisa: El codigo es mas limpio y mas facil de entender que el codigo basado en hilos.

//manejo sencillo de la concurrencia: Las corrutinas facilitan la ejecucion de tareas concurrentes sin necesidad
// de gestionar manualmente hilos o bloqueos.

//operaciones asincronas: Permiten realizar operaciones asincronas de manera sencilla y eficiente, como llamadas a la red,
// manipulacion de base de datos, etc.


public class General { }

//    fun main() {
//        // Se inicia una nueva corrutina
//        GlobalScope.launch {
//            delay(1000) // Simula una operación asíncrona
//            println("World!")
//        }
//
//        println("Hello, ")
//
//        // Se espera a que la corrutina termine
//        Thread.sleep(2000)
//    }


//          la funcion fechUserData simula una solicitud HTTP
//        suspend fun fetchUserData(id: Int): String {
//        // Simula una solicitud HTTP asíncrona
//        delay(1000)//Representa una operacion que lleva tiempo.
//        return "User data for id $id"
//        }
//          //creamos una lista de IDs en la funcion main
//        fun main() = runBlocking {
//        val userIds = listOf(1, 2, 3, 4, 5)
//          // usamos map para iniciar la corrutina, "async" para la simulacion de realizacion de varias solicitudes http.
//        val deferredResults: List<Deferred<String>> = userIds.map { id ->
//        // Se inicia una corrutina para cada solicitud HTTP
//        async {
//        fetchUserData(id)
//        }
//        }
//
//        // la funcion awaitAll() Se espera a que todas las corrutinas terminen y se recopilan los resultados
//        val results = deferredResults.awaitAll()
//
//        // en results Se imprime el resultado de cada solicitud
//        results.forEach { println(it) }
//        }


