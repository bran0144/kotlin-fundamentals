package com.rsk.kotlin

val action = {println("Hello World")}

val calc = {x :Int, y:Int -> x * y}

fun main(args: Array<String>) {
    doSomething(action)
}
fun doSomething(func: () -> Unit) {
    func()
}
