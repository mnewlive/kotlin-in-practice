package com.example.vadimm.kotlininaction.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    var tallest = 0
    var frequency = 0

    for (i in 0 until scan.nextInt()) {
        val height = scan.nextInt()

        if (height > tallest) {
            tallest = height
            frequency = 1
        } else if (height == tallest) frequency++
    }
    println(frequency)
}