package com.example.kts_metaclass_hw2.navigation

import kotlinx.serialization.Serializable

sealed class Screens(val route: String) {
    @Serializable
    object Start : Screens("start")
    @Serializable
    object Login : Screens("login")
}