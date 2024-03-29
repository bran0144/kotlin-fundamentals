package com.rsk.kotlin


fun main(args: Array<String>){
    var names = listOf("Kevin", "Alex")

    val name = names.itemAt(0)

    val n:Node<Int> = Node(12)
    println(n.value())
}

fun <T> List<T>.itemAt(ndx: Int) : T {
    return this[ndx]
}

class Node<T : Number>(private val item:T) {
    fun value():T {
        return item
    }
}