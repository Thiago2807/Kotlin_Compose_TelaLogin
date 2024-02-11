package com.example.treinamento002

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.CompositionLocalProvider
import com.example.treinamento002.domain.App
import com.example.treinamento002.ui.theme.Treinamento002Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Treinamento002Theme {
                App.Init();
            }
        }
    }
}