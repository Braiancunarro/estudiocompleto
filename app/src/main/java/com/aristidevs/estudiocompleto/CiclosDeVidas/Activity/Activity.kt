//package com.aristidevs.estudiocompleto.CiclosDeVidas.Activity
//
//El ciclo de vida de una actividad (Activity) en Android describe cómo la actividad pasa por diferentes estados desde su creación hasta su destrucción. Aquí está un resumen del ciclo de vida de una actividad:
//
//onCreate(): Este método se llama cuando la actividad está siendo creada. Aquí, generalmente se realiza la inicialización de la actividad, como la creación de la interfaz de usuario (inflar el diseño) y la inicialización de variables.
//
//onStart(): Se llama cuando la actividad se está volviendo visible para el usuario. En este punto, la actividad está en el frente, pero aún no tiene el enfoque del usuario.
//
//onResume(): Este método se invoca cuando la actividad está en primer plano y recibe el enfoque del usuario. Aquí, se deben realizar acciones que deben ocurrir cuando la actividad está en primer plano.
//
//onPause(): Se llama cuando la actividad está a punto de perder el enfoque. En este punto, la actividad aún es visible, pero está a punto de ser eclipsada por otra actividad.
//
//onStop(): Este método se llama cuando la actividad ya no es visible para el usuario. Puede ser llamado después de onPause() cuando la actividad va a ser completamente oculta.
//
//onRestart(): Se llama cuando la actividad está a punto de reiniciarse después de haber sido detenida. Este método se llama antes de onStart().
//
//onDestroy(): Se invoca cuando la actividad está siendo destruida. Aquí, se deben realizar acciones de limpieza y liberación de recursos.
//
//Además de estos métodos principales, hay otros eventos que pueden ocurrir, como la creación o destrucción de diálogos, cambios de configuración, etc. El ciclo de vida es esencial para gestionar adecuadamente los recursos y el estado de la actividad a lo largo del tiempo.
//
//Es importante notar que, en respuesta a eventos del sistema, como una rotación de la pantalla, la actividad puede pasar por varios estados nuevamente (desde onPause() hasta onResume()) debido a la recreación de la actividad. Para manejar esto de manera eficiente, se pueden usar métodos onSaveInstanceState() y onRestoreInstanceState(). Estos métodos permiten que la actividad conserve información importante durante recreaciones.
//


class Activity {
}