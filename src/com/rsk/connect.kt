@file:JvmName("DisplayFunctions")

package com.rsk

fun main(args: Array<String>){
    log(message="Hello", loglevel=2)
}
@JvmOverloads
fun log(message: String, loglevel: Int = 1) {
    println(message + loglevel)
}