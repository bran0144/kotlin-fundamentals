package com.rsk

fun main(args: Array<String>) : Unit {
    val ints = listOf(1,2,3,4,5)

    val largeInts = ints.all{it > 3}

    println(largeInts)
}