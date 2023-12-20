package com.aristidevs.estudiocompleto.InyeccionDeDependencias

//Inyeccion de dependencias

// Es un patron de diseño que se utiliza para facilitar la creacion y gestion de dependencias en una aplicación,



// DAGGER HILT
//Es una extension de Dagger 2, la biblioteca de inyeccion de dependencias para JAVA y android.
//Fue desarrollada por google para simplificar la implementacion.
//Para usarlo hay que agregar las dependencias adecuadas en build.gradle

//dependencias { implementation ("com.google.dagger:hilt-android:2.x")
//                 kapt ("com.google.dagger:hilt-android-compiler:2.x")
//                 implementation ("androidx.hilt:hilt-lifecycle-viewmodel:1.0.0-alpha03")
//                 kapt ("androidx.hilt:hilt-compiler:1.0.0")}

//luego anotar la aplicacion con @HiltAndroidApp en la clase MyApplication: Application()// debemos crearla

//en android manifest poner un atributo android:name = "ElproyectoAPP"

//en nuestra main activity vamos a ingresar el @AndroidEntryPoint, y solo con esto tenemos configurada la activity.
//en el siguiente paso ir a viewmodel, y preparar el viewmodel, la etiqueta necesaria es "@HiltViewModel
// y en el nombre de la clase ponemos @Inject constructo(aqui va todo lo que se quiera inyectar, sin necesidad de
//  crear una variable y definir la clase dentro del viewmodel).
//ejemplo, tengo la clase Pepito, y quiero inyectarla, en el viewmodel antes definia que
// var pepito : Pepito. De esta manera traia la clase pepito para poder usarla, la extendia.
//con dagger, lo que hago es que si la clase pepito esta preparada, voy a la clase y agrego el @Inject constructor().

//en el caso de retrofit es distinto, lo que podemos hacer con retrofit es:
//Crear en un directorio "di", y dentro crear un objeto NetworkModule,
//en el objeto vamos a definir dependencias que no sean faciles de proveer, como
//dependencias de libreria, o dependencias de clases que tengan interfaces.
//en este objeto agregamos la etiqueta dagger @Module, justo por arriba del nombre de la clase(en este caso objeto)
//y debajo vamos a ponerle @InstallIn(), que esto indica cuanto alcance van a querer que tenga,
//es decir que si por ejemplo ponemos de alcance una activity, cuando esa activity muera, muere tambien el objeto.
//la tabla siguiente son los tipos de alcance que tiene:


//      CLASE DE ANDROID         //   COMPONENTE GENERADO     //   ALCANCE
// Aplicattion                   -> ApplicationComponent      -> @Singleton
//View Model                     -> ActivityRetainedComponent -> @ActivityRetainedScope
// Activity                      -> ActivityComponent         -> @ActivityScoped
//  Fragment                     -> FragmentComponent         -> @FragmentScoped
// View                          -> ViewComponent             -> @ViewScoped
//View c/ @WithFragmentBinding   -> viewWithFragmentComponent -> @ViewScoped
// Service                       -> ServiceComponent          -> @ServiceScoped


//Si es Retrofit, seguramente usemos el uso en toda la aplicacion, por ende usaremos
// @InstallIn(SingletonComponent::class)

//dentro del objeto que creamos, creamos una funcion provideRetrofit(), y arriba de la funcion creamos una
//etiqueta @Provides.

//ejemplo completo.

// @Module
// @InstallIn(SingletonComponent::class)
//object NetworkModule{
//
//      @Singleton
//      @Provides
//      fun provideRetofit():Retrofit{
//      return Retrofit.Builder()
//                     .baseUrl("htttp.tubaseaqui.com")
//                     .addConverterFactory(GsonConverterFactory.create())
//                     .build()
//      }
// }


class General {
}