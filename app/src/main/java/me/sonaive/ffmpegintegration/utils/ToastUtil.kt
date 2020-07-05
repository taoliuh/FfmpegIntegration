package me.sonaive.ffmpegintegration.utils

import me.sonaive.lab.ext.toast
import me.sonaive.ffmpegintegration.App

inline fun toast(value: () -> String): Unit =
        App.instance().toast(value)