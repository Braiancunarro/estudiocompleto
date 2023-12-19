package com.aristidevs.estudiocompleto.PrincipiosSolid.InterfaceSegregationPrinciple

//Principio de segregacion de Interfaz

//el ISP establece que una clas eno debe estar obligada a implementar interfaces que no utiliza
// es mejor tener interfaces mas pequeñas y especificas en lugar de grandes y generales.
//esto ayuda a evitar dependencias innecesarias y a mantener una estructura de codigo mas limpia
// y facil de entender


interface Usuario {
    fun guardarUsuario()
    fun borrarUsuario()
    fun cambiarPassword()
}

class RegistrarUsuario: Usuario{
    override fun guardarUsuario() { //logica para registrar
        }
    override fun borrarUsuario() {}
    override fun cambiarPassword(){}
}

//en este caso, vemos que está mal que solo querramos registrar usuario y tengamos que implementar
// borrar usuario y cambiar password, porque viene incluido todo en el usuario.

//la forma correcta de implementarlo seria:

interface GuardarUsuario{
    fun guardarUsuario()
}

class RegistarUsuarioo: GuardarUsuario{
    override fun guardarUsuario() {
        //logica para registrar
    }
}