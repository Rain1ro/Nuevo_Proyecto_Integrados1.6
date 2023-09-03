package com.curso.android.app.practica.proyectointegrador16

import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.*
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Before
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.espresso.action.ViewActions.closeSoftKeyboard


@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {

    @Before
    fun setUp() {
       ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testTextComparison() {
        onView(withId(R.id.editText1)).perform(typeText("Hello"))
        onView(withId(R.id.editText2)).perform(typeText("World"))

        closeSoftKeyboard()

        onView(withId(R.id.button_Compare)).perform(click())

        val resultText = onView(withId(R.id.textViewResult))
        resultText.check(matches(withText("Texts are different")))

    }
}
