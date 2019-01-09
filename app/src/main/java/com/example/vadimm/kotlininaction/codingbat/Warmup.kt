package com.example.vadimm.kotlininaction.codingbat

/**
 * The parameter weekday is true if it is a weekday, and the parameter vacation is true
 * if we are on vacation. We sleep in if it is not a weekday or we're on vacation.
 * Return true if we sleep in.
 */
private fun sleepIn(isWeekDay: Boolean, isVacation: Boolean): Boolean {
    return !isWeekDay || isVacation
}

/**
 * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
 * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.
 */
private fun findMonkeyTrouble(aSmile: Boolean, bSmile: Boolean): Boolean {
    return aSmile && bSmile || !aSmile && !bSmile
}

/**
 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
 */
private fun calculateSum(a: Int, b: Int): Int {
    val sum: Int = a + b
    return if (a == b) sum * 2 else sum
}

/**
 * Given an int n, return the absolute difference between n and 21,
 * except return double the absolute difference if n is over 21.
 */
private fun calculateDifference(value: Int): Int {
    return if (value < 21) 21 - value else value - 21
}

/**
 * We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
 */
private fun findParrotTrouble(talking: Boolean, hour: Int): Boolean {
    return (talking && (hour < 7 || hour > 20))
}

/**
 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
 */
private fun makesTen(a: Int, b: Int): Boolean {
    val sum: Int = a + b
    return sum == 10 || a == 10 || b == 10
}

/**
 * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number
 */
fun nearHundred(n: Int): Boolean {
    return Math.abs(100 - n) <= 10 || Math.abs(200 - n) <= 10
}

fun main(args: Array<String>) {
    println("sleepIn " + sleepIn(isWeekDay = false, isVacation = true))
    println("findMonkeyTrouble ${findMonkeyTrouble(aSmile = false, bSmile = false)}")
    println("findMonkeyTrouble " + findMonkeyTrouble(aSmile = true, bSmile = true))
    println("findMonkeyTrouble " + findMonkeyTrouble(aSmile = true, bSmile = false))
    println("calculateSum " + calculateSum(1, 3))
    println("calculateSum " + calculateSum(2, 2))
    println("calculateDifference " + calculateDifference(value = 2))
    println("calculateDifference " + calculateDifference(value = 41))
    println("findParrotTrouble " + findParrotTrouble(talking = true, hour = 6))
    println("findParrotTrouble " + findParrotTrouble(talking = false, hour = 6))
    println("makesTen " + makesTen(10, 2))
    println("makesTen " + makesTen(9, 2))
    println("nearHundred " + nearHundred(9))
}