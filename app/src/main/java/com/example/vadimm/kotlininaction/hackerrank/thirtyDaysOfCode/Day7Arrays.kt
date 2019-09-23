package com.example.vadimm.kotlininaction.hackerrank.thirtyDaysOfCode

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    for (i in arr.size - 1 downTo 0) {
        print("${arr[i]} ")
    }
}