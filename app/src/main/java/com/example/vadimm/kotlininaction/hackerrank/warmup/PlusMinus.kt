package com.example.vadimm.kotlininaction.hackerrank.warmup

import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().trim().toInt()
    val arr = IntArray(n)

    for (a in 0 until n) {
        arr[a] = scan.nextInt()
    }

    val result = plusMinus(arr)
    println(result[0])
    println(result[1])
    println(result[2])
}

fun plusMinus(arr: IntArray): FloatArray {
    val result = FloatArray(size = 3)
    var negatives = 0
    var positives = 0
    var zeros = 0

    for (item in arr) {
        when {
            item > 0 -> positives++
            item < 0 -> negatives++
            else -> zeros++
        }
    }
    result[0] = (positives * 1.0 / arr.size).toFloat()
    result[1] = (negatives * 1.0 / arr.size).toFloat()
    result[2] = (zeros * 1.0 / arr.size).toFloat()
    return result
}