package com.example.vadimm.kotlininaction.hackerrank.thirtyDaysOfCode

import java.util.*


fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()

    scanner.nextLine()

    for (i in 0 until n) {
        val string = scanner.nextLine()
        val charArray = string.toCharArray()

        for (j in charArray.indices) { // TODO: try to simplify with forEachIndexed
            if (j % 2 == 0) {
                print(charArray[j])
            }
        }
        print(" ")

        for (j in charArray.indices) {
            if (j % 2 != 0) {
                print(charArray[j])
            }
        }
        println()
    }
    scanner.close()
}