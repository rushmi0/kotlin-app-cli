package com.apps.core.utils

interface LocalPlatform {
    val name: String
}

expect fun getPlatform(): LocalPlatform
