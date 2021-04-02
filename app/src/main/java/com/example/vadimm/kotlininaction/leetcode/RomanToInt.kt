package com.example.vadimm.kotlininaction.leetcode


fun romanToInt(s: String): Int {
    var sum = 0
    val map = HashMap<Char, Int>()
    map['I'] = 1
    map['V'] = 5
    map['X'] = 10
    map['L'] = 50
    map['C'] = 100
    map['D'] = 500
    map['M'] = 1000
    var prev = 0
    for (i in s.length - 1 downTo 0) {
        val curr = map[s[i]]
        sum += curr!! * (if (curr < prev) -1 else 1)
        prev = curr
    }
    return sum
}

fun main() {
    println(romanToInt("XI"))// 11
    println(romanToInt("MCMXCI"))//1991
}