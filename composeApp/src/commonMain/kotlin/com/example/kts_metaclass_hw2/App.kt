package com.example.kts_metaclass_hw2

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.kts_metaclass_hw2.navigation.AppNavHost

@Composable
fun App() {
    MaterialTheme {
        val navController = rememberNavController()
        AppNavHost(navController)
    }
}