package com.example.vadimm.kotlininaction.kotlininaction

import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(showAlphabet())
    println(showAlphabetWithFunctionWith())
    println(showAlphabetWithFunctionApply())
    println(showAlphabetWithBuildString())
}

fun showAlphabet(): String {
    val result = StringBuilder()
    for (letter in 'A'..'Z') {
        result.append(letter)
    }
    result.append("\n Now I know alphabet")
    return result.toString()
}

fun showAlphabetWithFunctionWith() = with(StringBuilder()) {
    for (letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know alphabet with function with")
    toString()
}

fun showAlphabetWithFunctionApply() =
    StringBuilder().apply {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\n Now I know alphabet with function apply")
    }.toString()

fun showAlphabetWithBuildString() =
    buildString {
        for (letter in 'A'..'Z') {
            append(letter)
        }
        append("\n Now I know alphabet with buildString")
    }
