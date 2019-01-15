package com.example.vadimm.kotlininaction.codingbat

import android.util.Log

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

/**
 * Given 2 int values, return true if one is negative and one is positive.
 * Except if the parameter "negative" is true, then return true only if both are negative.
 */
private fun posNeg(a: Int, b: Int, negative: Boolean): Boolean {
    return if (negative) (a > 0 && b > 0)
    else return (a < 0 && b > 0) || (a > 0 && b < 0)
}

/**
 * Given a string, return a new string where "not " has been added to the front.
 * However, if the string already begins with "not", return the string unchanged. Note: use .equals() to compare 2 strings.
 */
private fun getStringWithNot(str: String): String {
    return if (str.substring(0, 3).equals("not")) "" else "not$str"
}

/**
 * Given a non-empty string and an int n, return a new string where the char at index n has been removed.
 * The value of n will be a valid index of a char in the original string (i.e. n will be in the range 0..str.length()-1 inclusive).
 */
private fun removeIndexFromString(str: String, n: Int): String {
    val front: String = str.substring(0, n)
    val back: String = str.substring(n + 1, str.length)
    return front + back
}

/**
 * Given a string, return a new string where the first and last chars have been exchanged.
 */
private fun frontBack(str: String): String {
    if (str.length <= 1) return str
    val mid: String = str.substring(1, str.length - 1)
    return str[str.length -1] + mid + str[0]
}

/**
 * Given a string, we'll say that the front is the first 3 chars of the string. If the string length is less than 3,
 * the front is whatever is there. Return a new string which is 3 copies of the front.
 */
private fun front3(str: String): String {
    val front: String = if (str.length >= 3) str.substring(0, 3) else str
    return front + front + front
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
    println("posNeg " + posNeg(-2, 3, false))
    println("posNeg " + posNeg(-2, -3, false))
    println("posNeg " + posNeg(-2, -3, true))
    println("getStringWithNot " + getStringWithNot("Testik"))
    println("getStringWithNot " + getStringWithNot("notTest"))
    println("removeIndexFromString " + removeIndexFromString("some", 2))
    println("frontBack " + frontBack("some"))
    println("front3 " + front3("Kotlin"))
    println("front3 " + front3("ar"))
}