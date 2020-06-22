package com.algorithm.study.hackerrank

import java.math.BigDecimal
import java.math.RoundingMode
import java.util.*


// https://www.hackerrank.com/challenges/plus-minus/problem
fun plusMinus(arr: Array<Int>): Unit {
    var zeroCount: Double = 0.0
    var negativeCount: Double = 0.0
    var positiveCount: Double = 0.0

    arr.forEach {
        when {
            it == 0 -> zeroCount += 1
            it > 0 -> positiveCount += 1
            else -> negativeCount += 1
        }
    }

    val arrCount = arr.size
    val positiveResult = BigDecimal(positiveCount / arrCount).setScale(6, RoundingMode.CEILING)
    val negativeResult = BigDecimal(negativeCount / arrCount).setScale(6, RoundingMode.CEILING)
    val zeroResult = BigDecimal(zeroCount / arrCount).setScale(6, RoundingMode.CEILING)

    println(positiveResult)
    println(negativeResult)
    println(zeroResult)
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    val arr = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    plusMinus(arr)
}
