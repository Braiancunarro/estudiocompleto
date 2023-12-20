package com.aristidevs.estudiocompleto.InyeccionDeDependencias.Koin.ViewModel

import androidx.lifecycle.ViewModel
import com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.Repository.MyRepository

class MyViewModel(private val myRepository: MyRepository) : ViewModel() {

    fun fetchData(): String {
        return myRepository.getData()
    }
}
