package com.example.vadimm.kotlininaction.grokking_algorithms

// Просумируйте все числа и верните сумму
private fun sum(arr: Array<Int>): Int {
    var totalSum = 0
    for (x in arr) {
        totalSum += x
    }
    return totalSum
}

private fun sum2(arr: IntArray): Int {
    return when {
        arr.isEmpty() -> 0
        else -> arr[0] + sum2(arr.copyOfRange(1, arr.size))
    }
}

// Напишите рекурсивную функцию для подсчета элементов в списке.
private fun count(list: List<Any>): Int = when {
    list.isEmpty() -> 0
    else -> 1 + count(list.subList(1, list.size))
}

// Найдите наибольшее число в списке. ()
private fun findMaxNumber(list: IntArray): Int {
    return when (list.size) {
        2 -> if (list[0] > list[1]) list[0] else list[1]
        else -> {
            val subMax = findMaxNumber(list.copyOfRange(1, list.size))
            if (list[0] > subMax) list[0] else subMax
        }
    }
}

private fun quickSort(list: List<Int>): List<Int> {
    //базовый случай, когда массивы уже отсортированы
    if (list.size <= 1) return list
    //рекурсивный случай
    val pivot = list[0]
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }
    val equal = list.filter { it == pivot }
    return quickSort(less) + equal + quickSort(greater)
}

fun main() {
    println(sum(arrayOf(2, 4, 6)))
    println(sum2(intArrayOf(2, 4, 7)))
    println(count(listOf(0 ,1, 2, 3, 4, 5)))
    println(findMaxNumber(intArrayOf(1, 2, 3, 15, 10)))
    println(quickSort(listOf(1, 4, 5, 5, 9, 3)))
}