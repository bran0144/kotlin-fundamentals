package com.rsk

fun main(args: Array<String>) : Unit {
    val ints = listOf(1,2,3,4,5)
    val greaterThan3 = {v:Int -> v > 3}

    var largeInts = ints.all(greaterThan3)

    println(largeInts)

    largeInts = ints.any(greaterThan3)

    println(largeInts)

    var numberOfLargeInts = ints.count(greaterThan3)

    println(numberOfLargeInts)
}