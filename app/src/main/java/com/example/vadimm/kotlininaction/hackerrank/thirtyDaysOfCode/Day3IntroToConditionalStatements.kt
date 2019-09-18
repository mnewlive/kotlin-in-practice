package com.example.vadimm.kotlininaction.hackerrank.thirtyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val N = scan.nextLine().trim().toInt()

    when {
        N % 2 != 0 -> println("Weird")
        N in 2..5 -> println("Not Weird")
        N in 6..20 -> println("Weird")
        N > 20 -> println("Not Weird")
    }
}