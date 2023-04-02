package com.example.kmm_for_ios_test

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    val myConst = 42
}