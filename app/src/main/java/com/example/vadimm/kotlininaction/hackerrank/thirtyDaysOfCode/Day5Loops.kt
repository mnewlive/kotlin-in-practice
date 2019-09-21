package com.example.vadimm.kotlininaction.hackerrank.thirtyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()
    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}