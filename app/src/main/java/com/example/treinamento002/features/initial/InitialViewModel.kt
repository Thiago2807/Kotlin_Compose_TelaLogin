package com.example.treinamento002.features.initial

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class InitialViewModel : ViewModel() {
    private var _textMsg = MutableStateFlow("")

    val textMsg: StateFlow<String> = _textMsg

    // Método que serão responsáveis por alterar o estado do _textMsg
    fun alterMsg(newMsg: String) {
        _textMsg.value = newMsg
    }
}