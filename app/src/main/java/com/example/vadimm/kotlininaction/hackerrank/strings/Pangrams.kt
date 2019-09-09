package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun pangrams(s: String): String {
    return if (s.isPangram()) "pangram" else "not pangram"
}

fun String.isPangram(): Boolean {
    val sentence = this.toLowerCase()
    var letter = 'a'
    while (letter <= 'z') {
        if (sentence.indexOf(letter, 0, false) < 0) return false
        letter ++
    }
    return true
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val s = scan.nextLine()
    val result = pangrams(s)

    println(result)
}