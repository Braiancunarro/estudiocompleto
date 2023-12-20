package com.aristidevs.estudiocompleto.InyeccionDeDependencias.Koin


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.estudiocompleto.InyeccionDeDependencias.Koin.ViewModel.MyViewModel
import com.aristidevs.estudiocompleto.R

class MainActivity : AppCompatActivity() {

    // Obtén la instancia del ViewModel con Koin
    private lateinit var  myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = myViewModel.fetchData()

        // Haz algo con los datos, por ejemplo, muestra en un TextView
    }
}
