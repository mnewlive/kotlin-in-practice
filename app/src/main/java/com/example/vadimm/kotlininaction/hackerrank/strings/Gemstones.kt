package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

fun gemstones(arr: Array<String>): Int {
//    var brillian
//    var gem = 'a'
//    while (gem >='z') {
//        if ()
//    }
return 0
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = Array<String>(n, { "" })
    for (i in 0 until n) {
        val arrItem = scan.nextLine()
        arr[i] = arrItem
    }

    val result = gemstones(arr)

    println(result)
}