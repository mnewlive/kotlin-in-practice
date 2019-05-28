package com.example.vadimm.kotlininaction.hackerrank

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arrayOfFiveNumbers = Array(5, { scan.nextLong() })

    val sum = arrayOfFiveNumbers.sum()
    val min = sum - arrayOfFiveNumbers.max()!!
    val max = sum - arrayOfFiveNumbers.min()!!
    println("$min $max")
}