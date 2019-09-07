package com.example.vadimm.kotlininaction.hackerrank.strings

import java.util.*

//TODO: https://www.hackerrank.com/challenges/strong-password/problem Run and check it

val numbers = "0123456789".mapTo(hashSetOf()) { it }
val lower_case = "abcdefghijklmnopqrstuvwxyz".mapTo(hashSetOf()) { it }
val upper_case = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".mapTo(hashSetOf()) { it }
val special_characters = "!@#$%^&*()-+".mapTo(hashSetOf()) { it }

fun minimumNumber(n: Int, password: String): Int {
    return if (password.isStrong()) 0
    else println(Math.max(
        password.getNecessaryNumberOfChars(),
        6 - password.length
    )).toString().toInt()
}

private fun String.isStrong(): Boolean {
    return this.length >= 6 && !this.any {
        !numbers.contains(it) ||
            !lower_case.contains(it) ||
            !upper_case.contains(it) ||
            !special_characters.contains(it)
    }
}

fun Boolean.toInt() = if (this) 1 else 0

private fun String.getNecessaryNumberOfChars(): Int =
    setOf(numbers, lower_case, upper_case, special_characters)
        .map { x -> this.none { x.contains(it) } }
        .map { it.toInt() }
        .sum()

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val password = scan.nextLine()

    val answer = minimumNumber(n, password)

    println(answer)
}