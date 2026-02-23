package com.example.kts_metaclass_hw2.navigation

sealed class Screens(val route: String) {
    object Start : Screens("start")
    object Login : Screens("login")
}