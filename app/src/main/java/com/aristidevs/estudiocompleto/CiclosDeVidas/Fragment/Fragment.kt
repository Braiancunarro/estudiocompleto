//package com.aristidevs.estudiocompleto.CiclosDeVidas.Fragment
//
////ciclos de vida de un fragment
////
////  1-Fragment->OnAttach()->OnCreate()->OnCreateView->OnActivityCreated()->OnStart()->OnResume()
////  2Fragment is Running->OnPause()->OnStop()->OnDestroyView()->OnDestroy()->OnDetach()
////  3 FragmentEnd.
//
//
//En el contexto de desarrollo de aplicaciones Android, un "fragmento" se refiere a una porción de la interfaz de usuario o comportamiento de una actividad. Los fragmentos son componentes modulares que pueden ser reutilizados en diferentes actividades para construir interfaces de usuario flexibles y adaptables.
//
//El ciclo de vida de un fragmento en Android sigue un conjunto de eventos que ocurren desde su creación hasta su destrucción. Aquí hay un resumen del ciclo de vida de un fragmento:
//
//onAttach(): Se llama cuando el fragmento se ha asociado con su actividad. Aquí, el fragmento puede acceder a la actividad mediante el método getActivity().
//
//onCreate(): Se invoca cuando el fragmento está siendo creado. Aquí, puedes realizar inicializaciones básicas, pero aún no se ha asociado con la interfaz de usuario.
//
//onCreateView(): Este método se llama para que el fragmento cree su interfaz de usuario. Aquí, debes inflar y devolver el diseño de tu fragmento utilizando un objeto View.
//
//onActivityCreated(): Se llama cuando la actividad del fragmento ha sido creada y la vista asociada a la actividad ha sido inicializada. Es un buen lugar para realizar tareas que requieran la actividad y la vista.
//
//onStart(): Se invoca cuando el fragmento se vuelve visible para el usuario. Aquí, puedes realizar acciones que deben ocurrir cuando el fragmento se hace visible.
//
//onResume(): Se llama cuando el fragmento está activo y en primer plano. Aquí, puedes realizar tareas que deben estar en curso mientras el fragmento está en primer plano.
//
//onPause(): Se invoca cuando el fragmento está a punto de perder el foco o volverse inactivo. Aquí, deberías detener cualquier tarea que pueda estar en progreso.
//
//onStop(): Se llama cuando el fragmento ya no es visible para el usuario. Aquí, puedes realizar acciones que deben ocurrir cuando el fragmento se vuelve invisible.
//
//onDestroyView(): Se invoca cuando la vista asociada al fragmento está siendo destruida. Aquí, puedes realizar limpieza de recursos asociados con la interfaz de usuario.
//
//onDestroy(): Se llama cuando el fragmento está siendo destruido. Aquí, puedes realizar limpieza adicional, liberar recursos y realizar otras acciones necesarias antes de que el fragmento sea eliminado.
//
//onDetach(): Se invoca cuando el fragmento se desvincula de su actividad. Aquí, el fragmento ya no tiene acceso a la actividad.
//
//Es importante entender este ciclo de vida para gestionar adecuadamente los recursos y el estado del fragmento a lo largo del tiempo. Puedes anular estos métodos en tu código para realizar acciones específicas en cada etapa del ciclo de vida.
//
//
//


class Fragment {
}