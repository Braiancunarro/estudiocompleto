package com.aristidevs.estudiocompleto.PatronesDeDiseño

//Patron Observer
// Define una dependencia uno a muchos entre objetos para que cuando un objeto cambie su estado
// todos sus dependientes sean notificados y actualizados automaticamente.

interface Observer {
    fun update(data: String)
}

class ConcreteObserver : Observer {
    override fun update(data: String) {
        println("Data updated: $data")
    }
}

class Subject {
    private val observers = mutableListOf<Observer>()

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun notifyObservers(data: String) {
        for (observer in observers) {
            observer.update(data)
        }
    }
}

// Uso
val subject = Subject()
val observer = ConcreteObserver()
//subject.addObserver(observer)
//subject.notifyObservers("New data")
