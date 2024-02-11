package com.example.treinamento002.domain

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.treinamento002.domain.NavHostConfiguration.Companion.Configuration

class App {
    companion object {
        @Composable
        fun Init() {
            val navigationController = rememberNavController()

            CompositionLocalProvider(
                LocalSingletonNavigation provides navigationController
            ) {
                Configuration(navigationController)
            }
        }

        private val LocalSingletonNavigation = staticCompositionLocalOf<NavController>{
            error("Invalid singleton.")
        }
    }
}