package com.example.vadimm.kotlininaction.hackerrank.thirtyDaysOfCode

import java.util.*
import kotlin.math.round

fun solve(meal_cost: Double, tip_percent: Int, tax_percent: Int): Unit {
    val tip = meal_cost * tip_percent / 100
    val tax = meal_cost * tax_percent / 100
    val totalCost = round(tip + tax + meal_cost).toInt()
    println(totalCost)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val meal_cost = scan.nextLine().trim().toDouble()

    val tip_percent = scan.nextLine().trim().toInt()

    val tax_percent = scan.nextLine().trim().toInt()

    solve(meal_cost, tip_percent, tax_percent)
}