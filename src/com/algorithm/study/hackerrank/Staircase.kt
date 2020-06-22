package com.algorithm.study.hackerrank

//https://www.hackerrank.com/challenges/staircase/problem

import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

// https://www.hackerrank.com/challenges/staircase/problem
fun staircase(n: Int): Unit {
    for (i in 1..n) {
        var emptyLoof = n - i

        for (j in 1..n) {
            if (j <= emptyLoof) print(" ")
            else print("#")
        }

        println()
        emptyLoof++
    }
}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    val n = scan.nextLine().trim().toInt()

    staircase(n)
}
