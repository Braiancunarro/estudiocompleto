package com.aristidevs.estudiocompleto.InyeccionDeDependencias.Koin.Application
import android.app.Application
import com.aristidevs.estudiocompleto.InyeccionDeDependencias.DaggerHilt.ViewModel.MyViewModel
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.dsl.module

class MyApp : Application() {
    override fun onCreate() {
        super.onCreate()

        // Configura Koin
        startKoin {
            androidContext(this@MyApp)
            modules(myModule)
        }
    }
}

// Define un módulo Koin con las dependencias
val myModule = module {
    // Define una dependencia, por ejemplo, un ViewModel
    single { MyViewModel(get()) }
    // También podrías definir otras dependencias aquí
}

//no te olvides de declarar en android manifest en android:name = "tuaplicacion.app"(se setea solo).
