package com.example.vadimm.kotlininaction.yandex

fun main() {
    //даны 2 массива [1, 2, 3, 2, 0] и [5, 1, 2, 7, 3, 2]
    //надо вернуть [1, 2, 2, 3]
    println(getRepeatedIntersection(intArrayOf(1, 2, 3, 2, 0), intArrayOf(5, 1, 2, 7, 3, 2)))

    //AAAAAABBBBBBCCCCDDDDDDXXYZZZZ - A6B6C4D6X2YZ4
    println(countLetters("AAAAAABBBBBBCCCCDDDDDDXXYZZZZ"))

    //сгрупировать слова по общим буквам
    //Input ["eat", "tea", "ate", "bat"] Output [["eat", "tea", "ate"], ["bat"]]
    println(groupWords(arrayOf("eat", "tea", "ate", "bat")))
}

fun getRepeatedIntersection(a1: IntArray, a2: IntArray): List<Int> {
    val s1 = a1.toHashSet()
    val s2 = a2.toHashSet()

    val result = mutableListOf<Int>()

    for (el in s1) {
        if (s2.contains(el)) {
            val numbOfRepeats = minOf(a1.count { it == el}, a2.count { it == el })
            repeat(numbOfRepeats) {
                result.add(el)
            }
        }
    }
    return result
}

fun countLetters(str: String): String {
    var currentLetter = str[0]
    var count = 1
    var result = ""

    for (letter in str.substring(1)) {
        if (currentLetter == letter) {
            count++
        } else {
            if (count == 1) result += currentLetter
            else result += "$currentLetter$count"
            count = 1
            currentLetter = letter
        }
    }

    //lasts words in str
    if (count == 1) result += currentLetter
    else result += "$currentLetter$count"

    return result
}

fun groupWords(words: Array<String>): List<List<String>> {
    val result: MutableList<List<String>> = mutableListOf()
    val map = mutableMapOf<String, MutableList<String>>()

    for (word in words) {
        // ['a', 'b', 'c'].joinToString("-") -> 'a-b-c'
        val sortedWord = word.toCharArray().sorted().joinToString("")
        if (map.containsKey(sortedWord)) map[sortedWord]?.add(word)
        else map[sortedWord] = mutableListOf(word)
    }

    for ((key, value) in map) {
        result.add(value)
    }

    return result
}