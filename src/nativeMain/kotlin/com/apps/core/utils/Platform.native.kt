package com.apps.core.utils

import kotlin.native.OsFamily
import kotlin.native.Platform
import kotlin.experimental.ExperimentalNativeApi


class NativePlatform : LocalPlatform {
    override val name: String = getPlatformInfo()
}

actual fun getPlatform(): LocalPlatform = NativePlatform()


@OptIn(ExperimentalNativeApi::class)
private fun getPlatformInfo(): String {
    return when (Platform.osFamily) {
        OsFamily.WINDOWS -> "Windows: ${Platform.cpuArchitecture}"
        OsFamily.LINUX -> "Linux: ${Platform.cpuArchitecture}"
        OsFamily.MACOSX -> "MacOS: ${Platform.cpuArchitecture}"
        else -> "Unknown OS (${Platform.osFamily})"
    }
}
