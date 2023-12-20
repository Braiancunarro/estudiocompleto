package com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.ViewModel

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.Repository.MyRepository

class MyViewModel @ViewModelInject constructor(private val myRepository: MyRepository) : ViewModel() {

    fun fetchData(): String {
        return myRepository.getData()
    }
}

