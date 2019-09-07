package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun marsExploration(s: String): Int {
    var result = 0
    val pattern = "SOS"
    var i = 0
    while (i < s.length) {
        val j = i % 3
        if (s[i] != pattern[j]) {
            result++
        }
        i++
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = marsExploration(s)

    println(result)
}