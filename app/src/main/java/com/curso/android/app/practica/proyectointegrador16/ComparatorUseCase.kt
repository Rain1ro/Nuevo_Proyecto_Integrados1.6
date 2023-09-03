package com.curso.android.app.practica.proyectointegrador16


class TextComparatorUseCase(private val repository: TextComparatorRepository) {
    fun areTextsEqual(text1: String, text2: String): Boolean {
        return repository.areTextsEqual(text1, text2)
    }
}
