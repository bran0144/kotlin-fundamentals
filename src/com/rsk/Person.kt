package com.rsk

fun main(args: Array<String>) {
    val katie = Student("Katie","Gott", 1)
    print(katie.id)
}

abstract class Person(var firstName:String, var lastName:String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress(): String
    }

class Student(firstName:String, lastName:String, _id: Int): Person(firstName, lastName) {
    val id : Int
    var tutor: String

    init {
        id = _id
        tutor = ""
    }

    constructor(firstName: String, lastName: String, _id: Int, tutor:String) : this(firstName, lastName, _id) {
        this.tutor = tutor
    }
    override fun getAddress(): String {
        return ""
    }
    override fun getName() : String{return ""}
}
