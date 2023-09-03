package com.curso.android.app.practica.proyectointegrador16

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider


class TextComparatorViewModelFactory(private val useCase: TextComparatorUseCase) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {

        if (modelClass.isAssignableFrom(TextComparatorViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return TextComparatorViewModel(useCase) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}