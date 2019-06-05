package com.example.vadimm.kotlininaction.hackerrank

import java.util.*

//TODO: Resolve problem here
//fun main(args: Array<String>) {
//    val scan = Scanner(System.`in`)
//    val number: Int = scan.nextInt()
//
//    val aliceArray = IntArray(3)
//    val bobArray = IntArray(3)
//
//    readArray(scan, aliceArray)
//    readArray(scan, bobArray)
//
//    var aRes = 0
//    var bRes = 0
//
//    for (i in aliceArray.indices) {
//        if (aliceArray[i] > bobArray[i]) aRes++
//        else if (bobArray[i] > aliceArray[i]) bRes++
//    }
//    println("$aRes $bRes")
//}
//
//fun readArray(number: Scanner, someArray: IntArray) {
//        for (i in someArray.indices) {
//            someArray[i] = number.nextInt()
//        }
//}


fun main(args: Array<String>) {
    val `in` = Scanner(System.`in`)
    val a = IntArray(3)
    val b = IntArray(3)

    readArray(`in`, a)
    readArray(`in`, b)

    var aRes = 0
    var bRes = 0
    for (i in a.indices) {
        if (a[i] > b[i])
            aRes++
        else if (b[i] > a[i]) bRes++
    }
    println("$aRes $bRes")
}

private fun readArray(`in`: Scanner, a: IntArray) {
    for (i in a.indices) {
        a[i] = `in`.nextInt()
    }
}