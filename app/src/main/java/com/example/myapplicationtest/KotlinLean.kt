package com.example.helloword

import kotlin.math.max

class KotlinLean {

}

fun main() {
    println("Hello world!")
    println("max is: " + largeNumberCandy(1, 5))
    println(ifTest(10, 18))
    println(getScore("kane"))
    println(checkTheNumber(12))
}

fun methodA(p1: Int, p2: Int): Int {
    return p1 + p2
}

fun largeNumber(p1: Int, p2: Int): Int {
    return max(p1, p2);
}

fun largeNumberCandy(p1: Int, p2: Int) = max(p1, p2)

fun ifTest(p1: Int, p2: Int) = if (p1 > p2) {
    p1
} else {
    p2
}

fun getScore(name: String) = when (name) {
    "tome" -> 86
    "kane" -> 99
    "laser" -> 100
    else -> "no score"
}


fun checkNumber(num: Number): String {
    return when (num) {
        is Int -> "int"
        is Double -> "double"
        else -> "no"
    }
}


fun checkTheNumber(num: Int) = when {
    num > 10 -> "big"
    num < 10 -> "small"
    else -> "nomal"
}