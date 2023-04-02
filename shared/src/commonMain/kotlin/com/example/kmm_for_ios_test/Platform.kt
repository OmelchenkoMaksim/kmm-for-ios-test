package com.example.kmm_for_ios_test

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform