package com.example.vadimm.kotlininaction.random

sealed class Fruit() {

    class Banana() : Fruit()

    object Apple : Fruit() {
        fun name() {
            println("Apple")
        }
    }

    data class Mandarine(var name: String) : Fruit()
}

fun chooseFruit(fruit: Fruit) {
    return when (fruit) {
        is Fruit.Banana -> System.out.println("Banana")
        Fruit.Apple -> System.out.println("Apple")
        is Fruit.Mandarine -> System.out.println("Mandarine")
    }
}

/**
 * https://www.journaldev.com/18719/kotlin-sealed-class
 * https://kotlin.christmas/2019/5
 * https://kotlinlang.org/docs/reference/sealed-classes.html
 */
fun main(args: Array<String>) {
    val mandarine = Fruit.Mandarine("Mandarine")
    println(mandarine) //output: Mandarine(name=Mandarine)

    val goldenApple = Fruit.Apple
    goldenApple.name() //output: Apple
}

