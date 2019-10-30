package com.example.vadimm.kotlininaction.kotlininaction

import java.lang.StringBuilder

fun main(args: Array<String>) {
    println(showAlphabet())
}

fun showAlphabet():String = with(StringBuilder()){
    for(letter in 'A'..'Z') {
        append(letter)
    }
    append("\n Now I know alphabet")
    toString()
}
