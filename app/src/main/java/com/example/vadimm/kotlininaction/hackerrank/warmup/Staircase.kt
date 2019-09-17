package com.example.vadimm.kotlininaction.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val output = staircase(n)
    println(output)
}

fun staircase(n: Int): String {
    var output = ""
    for (i in 0 until n) {
        for (b in 0 until n) {
            if (b >= (n - i - 1)) output += "#"
            else output += " "
        }
        if (i != (n - 1)) output += "\n"
    }
    return output
}
