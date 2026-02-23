package com.example.kts_metaclass_hw2.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kts_metaclass_hw2.LoginScreen
import com.example.kts_metaclass_hw2.WelcomeScreen

@Composable
fun AppNavHost(
    navController: NavHostController = rememberNavController(),
) {
    NavHost(navController = navController, startDestination = Screens.Start.route) {
        composable(Screens.Start.route) {
            WelcomeScreen(
                onButtonClick = {
                    navController.navigate(Screens.Login.route)
                }
            )
        }
        composable(Screens.Login.route) {
            LoginScreen()
        }
    }
}