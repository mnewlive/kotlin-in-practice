package com.example.vadimm.kotlininaction.leetcode

import kotlin.math.abs

fun reverse(x: Int): Int {
    return if (x < 0) reverseNonNegative(number = abs(x)) * -1
    else reverseNonNegative(number = abs(x))
}

private fun reverseNonNegative(number: Int): Int {
    return number.toString().reversed().toIntOrNull() ?: 0
}

fun main() {
    println(reverse(x = - 320))
    println(reverse(x = 123))
}