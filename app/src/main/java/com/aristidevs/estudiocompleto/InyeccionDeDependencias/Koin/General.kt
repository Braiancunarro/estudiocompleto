package com.aristidevs.estudiocompleto.InyeccionDeDependencias.Koin

//Inyeccion de dependencias KOIN

//Es un inyector de dependencias creado especificamente para kotlin.
//Se basa en la reflexion, koin usa la resolucion de funciones y la sintaxis declarativa para definir
//y resolver dependencias. Es facil de usar y tiene una curva de aprendizaje mas suave.

//Conceptos claves:

//Módulo(Module):
// es una forma de definir las dependencias que se utilizan en tu aplicacion. Los modulos se definen utilizando
//la funcion "module" y contienenla configuracion de las dependencias.

//Single:
//es el alcance de las dependencias, que significa que solo habra una unica instancia de la dependencia
//durante todo el ciclo de vida de la aplicacion. Puedes usarlo para objetosque deben ser compartidos
//y reutilizados.

//ViewModel:
//Proporciona una extension para facilitar la creacion de instancias de ViewModel utilizando la funcion "viewmodel"
//Esto es especialmente util en android cuando trabajas con arquitecturas de componentes y viewmodels.

//Android Context:
//Koin requiere el contexto de android para poder inyectar dependencias en tus componentes de android.
//Puedes proporcionar el contexto al inicializar Koin en tu aplicacion.

class General {
}