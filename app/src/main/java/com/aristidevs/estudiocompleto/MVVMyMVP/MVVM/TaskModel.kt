package com.aristidevs.estudiocompleto.MVVMyMVP.MVVM

data class Task(val id: Int, val title: String, val isCompleted: Boolean)

class TaskModel {
    fun getAllTasks(): List<Task> {
        // Lógica para obtener todas las tareas desde algún origen de datos
        return listOf(
            Task(1, "Tarea 1", false),
            Task(2, "Tarea 2", true),
        )
    }
}
