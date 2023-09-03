package com.curso.android.app.practica.proyectointegrador16

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */


class TextComparatorUseCaseTest {

    @Test
    fun `areTextsEqual returns true when texts are equal`() {

        val repository = TextComparatorRepository()
        val useCase = TextComparatorUseCase(repository)
        val text1 = "Hello, world!"
        val text2 = "Hello, world!"


        val result = useCase.areTextsEqual(text1, text2)


        assert(result)
    }

    @Test
    fun `areTextsEqual returns false when texts are different`() {

        val repository = TextComparatorRepository()
        val useCase = TextComparatorUseCase(repository)
        val text1 = "Hello, world!"
        val text2 = "Hola, mundo!"


        val result = useCase.areTextsEqual(text1, text2)


        assert(!result)
    }
}
