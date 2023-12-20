package com.aristidevs.estudiocompleto.MVVMyMVP.MVVM

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.aristidevs.estudiocompleto.R

class TaskActivity : AppCompatActivity() {

    private lateinit var taskViewModel: TaskViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_task)// si activo esto tengo que crear la vista, pero ahi iria eso.

        // Inicializar el ViewModel
        taskViewModel = ViewModelProvider(this).get(TaskViewModel::class.java)

        // Observar cambios en las tareas y actualizar la interfaz de usuario
        taskViewModel.tasksLiveData.observe(this, Observer { tasks ->
            displayTasks(tasks)
        })

        // Iniciar la carga de tareas
        taskViewModel.loadTasks()
    }

    private fun displayTasks(tasks: List<Task>) {
        // Actualizar la interfaz de usuario con las tareas
        // (En este caso, puedes mostrar las tareas en un RecyclerView, por ejemplo)
    }
}
