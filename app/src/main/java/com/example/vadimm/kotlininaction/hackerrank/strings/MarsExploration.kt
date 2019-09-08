package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun marsExploration(s: String): Int {
    var result = 0
    val pattern = "SOS"
    var numberOfWords = 0
    while (numberOfWords < s.length) {
        val j = numberOfWords % 3
        if (s[numberOfWords] != pattern[j]) {
            result++
        }
        numberOfWords++
    }
    return result
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val result = marsExploration(s)

    println(result)
}