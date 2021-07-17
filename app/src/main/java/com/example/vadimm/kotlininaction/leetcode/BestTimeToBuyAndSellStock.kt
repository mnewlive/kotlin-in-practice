package com.example.vadimm.kotlininaction.leetcode

fun maxProfit(prices: IntArray): Int {
    if (prices.isEmpty()) return 0
    var ans = 0
    var min = prices[0]
    for (i in 1 until prices.size) {
        min = Math.min(min, prices[i])
        ans = Math.max(prices[i] - min, ans)
    }
    return ans
}

fun main() {
    println(maxProfit(intArrayOf(7,1,5,3,6,4)))
}