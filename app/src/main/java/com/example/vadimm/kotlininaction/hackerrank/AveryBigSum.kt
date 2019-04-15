package com.example.vadimm.kotlininaction.hackerrank

import java.math.BigInteger
import java.util.*

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)
    val arCount = scan.nextInt()
    val arr = IntArray(arCount)

    for (i in 0 until arCount) {
        arr[i] = scan.nextInt()
    }
    val result = aVeryBigSum(arr)
    println(result)
}

fun Int.toBigInteger() = BigInteger.valueOf(toLong())

// Complete the aVeryBigSum function below.
fun aVeryBigSum(ar: IntArray): BigInteger {
    var sum = BigInteger.ZERO
    for (i in ar) {
        sum += i.toBigInteger()
    }
    return sum
}