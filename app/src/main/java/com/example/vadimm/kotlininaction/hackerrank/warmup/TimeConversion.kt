package com.example.vadimm.kotlininaction.hackerrank.warmup

import java.lang.Exception
import java.text.SimpleDateFormat
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val time: String = scan.next()
    val result = timeConversion(time)
    println(result)
}

private fun timeConversion(time: String): String {
    val dateTimeFormat = SimpleDateFormat("hh:mm:ssa")
    var result = Date()
    try {
        result = dateTimeFormat.parse(time)
    } catch (e: Exception) {
    }
    val currentDateOfMarker = SimpleDateFormat("HH:mm:ss", Locale.ENGLISH)
    return currentDateOfMarker.format(result)
}

