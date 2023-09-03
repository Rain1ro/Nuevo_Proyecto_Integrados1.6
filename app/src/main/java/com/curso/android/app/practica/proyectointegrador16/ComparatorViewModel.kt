package com.curso.android.app.practica.proyectointegrador16

import androidx.lifecycle.ViewModel

class TextComparatorViewModel(private val useCase: TextComparatorUseCase) : ViewModel() {

    fun areTextsEqual(text1: String, text2: String): Boolean {
        return useCase.areTextsEqual(text1, text2)
    }
}