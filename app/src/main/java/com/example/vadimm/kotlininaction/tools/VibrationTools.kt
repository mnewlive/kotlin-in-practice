package com.example.vadimm.kotlininaction.tools

import android.os.Build
import android.os.VibrationEffect
import android.os.Vibrator

@Suppress("DEPRECATION")
fun Vibrator?.vibrateOnce() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        this?.vibrate(VibrationEffect.createOneShot(150, VibrationEffect.DEFAULT_AMPLITUDE))
    } else {
        this?.vibrate(150)
    }
}

@Suppress("DEPRECATION")
fun Vibrator?.multiVibrate() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
        this?.vibrate(VibrationEffect.createWaveform(getVibratePattern(), -1))
    } else {
        this?.vibrate(getVibratePattern(), -1)
    }
}

fun getVibratePattern(): LongArray = longArrayOf(0, 150, 100, 150)