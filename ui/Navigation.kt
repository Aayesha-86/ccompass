package com.example.travel.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun TravelApp() {
    val navController = rememberNavController()

    NavHost(navController, startDestination = "welcome") {
        composable("welcome") {
            WelcomeScreen(navController)
        }
        composable("search") {
            TravelSearchScreen(navController)
        }
        composable("results/{destination}/{budget}") { backStackEntry ->
            val destination = backStackEntry.arguments?.getString("destination") ?: ""
            val budget = backStackEntry.arguments?.getString("budget") ?: ""
            ResultsScreen(destination, budget)
        }
    }
}
