package com.example.vadimm.kotlininaction.leetcode

fun isPalindrome(x: Int): Boolean {
    val initialString = x.toString()
    val reversedString = initialString.reversed()
    return (x >= 0) && initialString == reversedString
}

fun isPalindromeCase2(x: Int): Boolean {
    return (x >= 0) && x.toString().reversed().toIntOrNull() == x
}

fun main() {
    print(isPalindrome(121))
    print(isPalindromeCase2(123))
}