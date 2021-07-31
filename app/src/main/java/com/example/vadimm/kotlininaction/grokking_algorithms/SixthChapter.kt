package com.example.vadimm.kotlininaction.grokking_algorithms

import java.util.*
import kotlin.collections.HashMap
import kotlin.collections.HashSet

data class Person(
        val name: String,
        val isSellerMango: Boolean = false
)

typealias Graph<V> = MutableMap<V, List<V>>

fun <V> Graph<V>.breadthFirstSearch(key: V, isSearched: (V) -> Boolean): Boolean {
    val queue: Deque<V> = LinkedList()
    this[key]?.let { queue += it }
    val searched = HashSet<V>()
    while (queue.isNotEmpty()) {
        val value = queue.pop()
        if (!searched.contains(value))
            if (isSearched(value)) {
                println("$value is here!")
                return true
            } else {
                this[value]?.let { queue += it }
                searched.add(value)
            }
    }
    return false
}

fun main() {
    val graph: Graph<Person> = HashMap()

    (graph as HashMap<Person, List<Person>>).apply {
        put(Person("John"), listOf(Person("Sergey"), Person("Viktoria")))
        put(Person("Viktoria"), listOf(Person("Sergey"), Person("Phara")))
        put(Person("Phara"), listOf(Person("Sergey"), Person("Thrall"),
                Person("Xul"), Person("Juncart", true)))
    }

    println(
            graph.breadthFirstSearch(Person("John"), Person::isSellerMango)
    )
}