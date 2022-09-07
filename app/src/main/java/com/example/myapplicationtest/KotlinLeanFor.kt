package com.example.helloword

class KotlinLeanFor {
}

fun main() {
    forTest2();
}


fun forTest() {
    println("start...")
    val range = 0..10
    for (i in range step 2) {
        println(i)
    }

}

fun forTest2() {
    for (i in 0 until 100 step 5) {
        println(i)
    }
}