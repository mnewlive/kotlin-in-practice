package com.example.vadimm.kotlininaction.leetcode


fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = nums.withIndex().associateBy( { it.value }, { it.index } )
    println("map: $map")
    
    nums.forEachIndexed { index, n ->
        println("index: $index n: $n")

        val complement = target - n
        println("complement: $complement")

        if (map.containsKey(complement) && map[complement] != index) {
            println("index $index map.getValue(complement): ${map.getValue(complement)}")
            return intArrayOf(index, map.getValue(complement))
        }
    }
    throw IllegalArgumentException("no 2 values sum to the target ($target)")
}

fun main(args: Array<String>) {
//    print(twoSum(intArrayOf(3, 2, 4), target = 6).contentToString())
//    print(twoSum(intArrayOf(2, 2, 4, 7, 11, 15), target = 9).contentToString())
//    print(twoSum(intArrayOf(2, 2, 4), target = 9).contentToString())
}