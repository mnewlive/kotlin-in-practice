package com.example.vadimm.kotlininaction.random


val array = intArrayOf(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)

fun printArraySinceZero() {
    for (index in 1 until array.size) {
        println(array[index])
    }
}

fun printArrayWithoutFive() {
    for (index in array.indices - 5) {
        println(array[index])
    }
}

fun printArrayDownWithStep() {
    for (index in array.size - 1 downTo 0 step 2) {
        println(array[index])
    }
}

fun removeVowels(word: String): String {
    val vowels = setOf<Char>('a', 'e', 'i', 'o', 'u') // a in b равносильно b.contains(a)
    return word.filter { it !in vowels }
}

fun runningSumWithRunningReduce(nums: IntArray): IntArray {
    return nums.runningReduce { sum, element -> sum + element }.toIntArray()
}

fun runningSum(): Int {
    val numbers: List<Int> = listOf(1, 2, 3)
    return numbers.reduce { acc, next -> acc + next }
}

fun runningSumWithFoldCase1(nums: IntArray): IntArray {
    return nums.fold(mutableListOf(0)) { acc, cur -> acc += (acc.last() + cur); acc } .drop(1).toIntArray()
}

fun runningSumWithFoldCase2(nums: IntArray): IntArray {
    return nums.fold(mutableListOf(0)) { acc, cur -> acc.apply { add(acc.last() + cur) } }.drop(1).toIntArray()
}

fun runningSumWithFor(nums: IntArray): IntArray {
    for (i in nums.indices.drop(1)) {
        nums[i] += nums[i - 1]
    }
    return nums
}

fun mostCommonWord(paragraph: String, banned: Array<String>): String {
    // 1. Covert string to lower case and split by words.
    val words = paragraph.toLowerCase().split("\\W+|\\s+".toRegex())
    // 2. Create a set of banned words.
    val bannedSet = banned.toHashSet()
    // 3. Create a map of words to their occurrence, excluding the banned words
    val wordToCount = words.filterNot { it in bannedSet }.groupingBy { it }.eachCount()
    // 4. Return word with the highest number of occurrences from the map.
    return wordToCount.maxBy { it.value }!!.key
}

fun main(args: Array<String>) {
//    printArraySinceZero()
//    printArrayWithoutFive()
//    printArrayDownWithStep()
//    print(removeVowels("Hello world!"))

//    https://stackoverflow.com/questions/66110567/how-i-can-return-intarray-with-reduce-or-fold/66114178#66114178
    println(runningSumWithRunningReduce(intArrayOf(1, 3, 7)).contentToString())
    println(runningSumWithFoldCase1(array).contentToString())
    println(runningSumWithFoldCase2(array).contentToString())
    println(runningSumWithFor(array).contentToString())

//    println(mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.", arrayOf("hit")))
}