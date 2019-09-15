package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun alternatingCharacters(s: String): Int {
    var duplicate = 0
    for (i in 1 until s.length) {
        if (s[i - 1] == s[i]) {
            duplicate++
        }
    }
    return duplicate
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val q = scan.nextLine().trim().toInt()

    for (qItr in 1..q) {
        val s = scan.nextLine()

        val result = alternatingCharacters(s)

        println(result)
    }
}