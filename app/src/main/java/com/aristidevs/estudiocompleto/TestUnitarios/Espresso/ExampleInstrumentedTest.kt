//package com.aristidevs.estudiocompleto.TestUnitarios.Espresso
//
//import androidx.test.espresso.Espresso
//import androidx.test.espresso.action.ViewActions
//import androidx.test.espresso.matcher.ViewMatchers
//import androidx.test.ext.junit.runners.AndroidJUnit4
//import androidx.test.rule.ActivityTestRule
//import org.junit.Rule
//import org.junit.Test
//import org.junit.runner.RunWith
//
//@RunWith(AndroidJUnit4::class)
//class ExampleInstrumentedTest {
//
//    @get:Rule
//    val activityRule = ActivityTestRule(MainActivity::class.java)
//
//    @Test
//    fun testUpdateText() {
//        // Escribir texto en el EditText
//        Espresso.onView(ViewMatchers.withId(R.id.editText))
//            .perform(ViewActions.typeText("Texto de prueba"))
//
//        // Hacer clic en el botón
//        Espresso.onView(ViewMatchers.withId(R.id.button))
//            .perform(ViewActions.click())
//
//        // Verificar que el TextView se haya actualizado correctamente
//        Espresso.onView(ViewMatchers.withId(R.id.textView))
//            .check(ViewAssertions.matches(ViewMatchers.withText("Texto de prueba")))
//    }
//}
