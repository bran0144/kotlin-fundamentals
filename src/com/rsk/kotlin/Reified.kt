package com.rsk.kotlin

fun main(args: Array<String>) {
    val names = listOf("Katie")

    printType(listOf(1))
}

fun printType(items: List<Any>) {
    val stuff = items as List<String>

    stuff.filter{s -> s == ""}
}