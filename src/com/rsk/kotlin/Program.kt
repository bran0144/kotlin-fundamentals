package com.rsk.kotlin


fun main(args: Array<String>){
    var names = listOf("Kevin", "Alex")

    val name = names.itemAt(0)
}

fun <T> List<T>.itemAt(ndx: Int) : T {
    return this[ndx]
}