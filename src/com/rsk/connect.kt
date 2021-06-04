@file:JvmName("DisplayFunctions")

package com.rsk

fun main(args: Array<String>){
    log("Hello")
}
fun log(message: String, loglevel: Int = 1) {
    println(message)
}