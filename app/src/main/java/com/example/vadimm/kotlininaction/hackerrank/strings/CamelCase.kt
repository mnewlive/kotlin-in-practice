package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun camelcase(s: String): Int {
    var countOfCapitalLetters = 1
    for (numberOfCharacters in 0 until s.length){
        if (Character.isUpperCase(s[numberOfCharacters])) {
            countOfCapitalLetters += 1
        }
    }
    return countOfCapitalLetters
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)

    println(result)
}