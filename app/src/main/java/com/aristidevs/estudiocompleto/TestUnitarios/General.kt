package com.aristidevs.estudiocompleto.TestUnitarios


//TEST UNITARIOS

//Son pruebas  que se centran en una parte aislada del codigo, generalmente en una funcion o metodo.
//El objetivo es verificar que una unidad de codigo funcione como s eespera.
//se diseñaron para ser rapidos, independientes y repetibles.

//tenemos tres tipos de test unitarios

//JUNIT:
//proporciona anotaciones y clases para facilitar la escritura y ejecucion de test unitarios.
//utiliza anotaciones(metadatos especiales precedidos por "@"), para marcar metodos como test y configurar
// el comportamiento de las pruebas. Las mas comunes son:
//ANOTACIONES
//@Test: Marca un metodo como test unitario.
//@Before: indica que un metodo se ejecutara antes de cada test.
//@After: Indica que un metodo se ejecutara despues de cada test.
//@BeforeClass: Indica que un metodo se ejecutara una vez antes de que inicien todos los test de la clase.
//@AfterClass: Indica que un metodo se ejecutara una vez despues de que se hayancompletado todos los test de la clase.

//ASSERTS(afirmaciones)
//assertEquals(expected, actual): Verifica que dos valores sean iguales.
//assertTrue(condicion) : Verifica que la condicion proporcionada sea verdadera.
//assertFalse(condicion): Verifica que la condicion proporcionada sea falsa.
//assertNotNull(object): Verifica que el objeto proporcionado no sea nulo.

//Suite de Test:
//Permiten agrupar varios test en una "suite" que se ejecuta como unidad. Se logra mediante una clase que anota
// @RunWith y extiende "suite".

//Parametrizacion de Test:
//Puedes parametrizar tus test usando @Parameterized, esto te permite ejecturar el test con diferentes conjunto de datos.

//Rules:
// Las reglas son una caracteristica avanzada, que permite aplicar comportamiento adicional a tus test.

//--------------------------------------------------------------------------------------------------------------

//Mockito:
//Facilita la creacion y uso de objetos simulados, llamados mocks. Estos son objetos simulados que imitan
//el comportamiento de objetos reales, pero permiten controlar su comportamiento durante las pruebas.
//sus caracteristicas incluyen:

//Creacion de Mocks: mockito permite crear mocks de interfaces y clases, incluso para aquellas que no tienen una
//implementacion concreta.

//Configuracion de comportamiento: puedes configurar el comportamiento de los mocks para que devuelvan valores
//especificos, lancen excepciones o realicen acciones cuando se les llame.

//Verificacion de interacciones:Mockito da metodos para verificar si ciertos metodos en los mocks fueron llamados
// con los argumentos correctos y en su orden correcto.

//Sintaxis limpia y legible: facilita la escritura y lectura de los test.

//-----------------------------------------------------------------------------------------------------------------

//ESPRESSO

//es un framework de prueba para la interfaz de usuario.
//sus caracteristicas incluyen:

//


class General {
}