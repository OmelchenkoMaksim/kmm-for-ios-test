package com.example.kmm_for_ios_test

//import platform.UIKit.UIDevice

class IOSPlatform: Platform {
    override val name: String = getPlatform().name
//    UIDevice.currentDevice.systemName() + " " + UIDevice.currentDevice.systemVersion
}

actual fun getPlatform(): Platform = IOSPlatform()