package com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.Repository

import javax.inject.Inject

class MyRepositoryImpl @Inject constructor() : MyRepository {
    override fun getData(): String {
        return "Datos de Ejemplo"
    }
}
