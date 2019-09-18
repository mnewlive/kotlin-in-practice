package com.example.vadimm.kotlininaction.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = Array(n) { Array(size = n, init = { 0 }) }

    for (i in 0 until n) {
        arr[i] = scan.nextLine().split(" ").map { it.trim().toInt() }.toTypedArray()
    }

    val result = calculateDiagonalDifference(arr)
    println(result)
}

fun calculateDiagonalDifference(arr: Array<Array<Int>>): Int {
    var primaryDiagonal = 0
    var secondaryDiagonal = 0
    for (a in 0 until arr.size) {
        val row = arr[a]
        for (b in 0 until row.size) {
            if (a == b) {
                primaryDiagonal += row[b]
            }
            if ((a + b) == (arr.size - 1)) {
                secondaryDiagonal += row[b]

            }
        }
    }
    return if (primaryDiagonal > secondaryDiagonal) primaryDiagonal - secondaryDiagonal
    else secondaryDiagonal - primaryDiagonal
}