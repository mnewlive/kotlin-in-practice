package com.example.vadimm.kotlininaction.kotlininaction

fun displayStringInJava() {
    println("12.345-6.A".split("\\.|-".toRegex()))
}

fun displayStringInKotlin() {
    println("12.345-6.A".split(".", "-"))
}

private fun displayManyStrings() {
    val kotlinLogo = """| //
                       .|//
                       .|\\
                       .| \\"""
    println(kotlinLogo.trimMargin("."))
}

fun main(args:Array<String>) {
    displayStringInJava()
    displayStringInKotlin()
    displayManyStrings()
}