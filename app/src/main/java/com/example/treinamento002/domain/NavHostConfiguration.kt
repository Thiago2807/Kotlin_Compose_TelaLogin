package com.example.treinamento002.domain

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.treinamento002.features.initial.InitialScreen

class NavHostConfiguration {
    companion object {
        @Composable
        fun Configuration(navController: NavHostController) {
            NavHost(navController = navController, startDestination = Routes.Initial.name) {
                composable(Routes.Initial.name) {
                    InitialScreen()
                }
            }
        }
    }
}