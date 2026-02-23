package com.example.kts_metaclass_hw2

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform