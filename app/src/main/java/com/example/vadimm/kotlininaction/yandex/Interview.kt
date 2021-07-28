package com.example.vadimm.kotlininaction.yandex

//https://m.habr.com/ru/company/yandex/blog/449890/

/**
 * Даны две строки строчных латинских символов: строка J и строка S.
 * Символы, входящие в строку J, — «драгоценности», входящие в строку S — «камни».
 * Нужно определить, какое количество символов из S одновременно являются «драгоценностями».
 * Проще говоря, нужно проверить, какое количество символов из S входит в J.
 */

fun findSolution1() {
    val j = readLine()!! //ab
    val s = readLine()!! //aabbcd

    var jewelry = 0
    for (i in s) {
        if (j.contains(i)) {
            jewelry += 1
        }
    }
    println(jewelry) //4
}

/**
 * Требуется найти в бинарном векторе самую длинную последовательность единиц и вывести её длину.
 */
fun findSolution21() {
    var max: Int = 0
    var prevMax: Int = 0
    var s = readLine()!!
    var count: Int = s.toInt()
    while (count > 0) {
        s = readLine()!!
        if (s == "1") {
            max++
        } else {
            if (prevMax < max) {
                prevMax = max
            }
            max = 0
        }
        count--
    }
    if (prevMax < max) {
        prevMax = max
    }
    println(prevMax)
}

fun findSolution22() {
    var max: Int = 0
    var prevMax: Int = 0
    val lines = List(readLine()?.toIntOrNull() ?: error("Number of elements not defined")){ readLine() }

    lines.forEach{
        if (it == "1") {
            max++
        } else {
            if (prevMax < max) {
                prevMax = max
            }
            max = 0
        }
    }

    if (prevMax < max) {
        prevMax = max
    }
    println(prevMax)
}


/**
 * Дан упорядоченный по неубыванию массив целых 32-разрядных чисел. Требуется удалить из него все повторения.
 * Максимальное кол-во повторений 2.
 */
fun removeConsecutiveCharactersInString(str: String, maxConsecutiveAllowedCount: Int): String {
    val builder = StringBuilder(str)
    var i = 0
    while (i < builder.length) {
        var foundCount = 0
        for (j in i - 1 downTo 0) {
            if (lowerCasedChar(builder[i]) == lowerCasedChar(builder[j])) {
                foundCount++
                if (foundCount >= maxConsecutiveAllowedCount) {
                    builder.deleteCharAt(i)
                    i--
                    break
                }
            } else {
                break
            }
        }
        i++
    }
    return builder.toString()
}

private fun lowerCasedChar(ch: Char): Char {
    val intChar = ch.toInt()
    return if (intChar >= 65 && intChar <= 90) {
        (intChar + 32).toChar()
    } else ch
}



fun main() {
//    findSolution1()
//    findSolution21()
//    findSolution22()
    println(removeConsecutiveCharactersInString("abccccdddaf", 2))
}
