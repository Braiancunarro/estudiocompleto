package com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.ViewModel.MyViewModel
import com.aristidevs.estudiocompleto.R
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val data = viewModel.fetchData()

        // Haz algo con los datos, por ejemplo, muestra en un TextView
    }
}
