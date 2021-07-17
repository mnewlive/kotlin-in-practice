package com.example.vadimm.kotlininaction.leetcode

class NumberComplement {

    fun findComplement(num: Int): Int {
        val count = Integer.numberOfLeadingZeros(num)
        return num.inv().shl(count).shr(count)
    }
}