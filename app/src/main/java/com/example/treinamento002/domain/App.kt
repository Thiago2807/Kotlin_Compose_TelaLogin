package com.example.treinamento002.domain

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.treinamento002.domain.NavHostConfiguration.Companion.Configuration
import com.example.treinamento002.features.initial.InitialViewModel

class App {
    companion object {
        @Composable
        fun Init() {
            val navigationController: NavHostController = rememberNavController()
            val viewModelInitial: InitialViewModel = viewModel<InitialViewModel>();

            CompositionLocalProvider(
                LocalSingletonNavigation provides navigationController,
                LocalModelViewInitial provides viewModelInitial
            ) {
                Configuration(navigationController)
            }
        }

        val LocalSingletonNavigation = staticCompositionLocalOf<NavController>{
            error("Invalid singleton navigation.")
        }

        val LocalModelViewInitial = staticCompositionLocalOf<InitialViewModel>{
            error("Invalid model view initial.")
        }

    }
}