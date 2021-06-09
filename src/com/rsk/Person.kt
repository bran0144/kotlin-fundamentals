package com.rsk

fun main(args: Array<String>) {
    val katie = Student(1)
    print(katie.id)
}

abstract class Person {
    var firstName:String = ""
    var lastName:String = ""

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress(): String
    }

class Student(val id: Int): Person() {
    override fun getAddress(): String {
        return ""
    }
    override fun getName() : String{return ""}
}
