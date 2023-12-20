package com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.Application

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application()

//no te olvides de ir a android manifest y declarar en application

//android:name="Elnombredetuclase.app" (se setea por defecto)
