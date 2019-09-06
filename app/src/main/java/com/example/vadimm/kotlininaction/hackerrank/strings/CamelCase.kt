package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun camelcase(s: String): Int {
    var count = 1
    for (i in 0 until s.length){
        if (Character.isUpperCase(s[i])) {
            count += 1
        }
    }
    return count
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val s = scan.nextLine()

    val result = camelcase(s)

    println(result)
}