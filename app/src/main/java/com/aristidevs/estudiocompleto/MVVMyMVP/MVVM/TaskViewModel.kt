package com.aristidevs.estudiocompleto.MVVMyMVP.MVVM
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {
    private val model = TaskModel()

    // LiveData para mantener las tareas actualizadas en la Vista
    val tasksLiveData = MutableLiveData<List<Task>>()

    fun loadTasks() {
        // Lógica para cargar las tareas desde el Modelo
        val tasks = model.getAllTasks()

        // Actualizar el LiveData con las tareas cargadas
        tasksLiveData.value = tasks
    }
}
