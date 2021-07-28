package com.example.vadimm.kotlininaction.grokking_algorithms

val fruits = hashMapOf<String, Double>(
        "apple" to 1.23,
        "mandarine" to 2.3,
        "avokado" to 3.2
)

val votedName: HashMap<String, Boolean> = HashMap<String, Boolean>()

fun checkVoter(name: String) {
    if (votedName.containsKey(name)) println("kick them out!")
    else {
        votedName.put(key = name, value = true)
        println("let them vote!")
    }
}


fun main() {
    println(fruits)
    println(fruits["apple"])
    checkVoter("John")
    checkVoter("John")
}