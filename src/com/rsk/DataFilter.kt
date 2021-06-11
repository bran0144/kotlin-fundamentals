package com.rsk

fun main(args: Array<String>) {
    val ints = listOf(1,2,3,4,5)

    val smallInts = ints.filter{ it < 4 }

    for (i: Int in smallInts) println(i)
}