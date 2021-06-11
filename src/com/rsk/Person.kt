package com.rsk

fun main(args: Array<String>) {
    val katie = Student("Katie","Gott", 1, "some tutor")
    print(katie.id)

    Student.createPostGraduate("Simon")
    Student.createUndergraduate("Kelly")
}

class Program1 {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val katie = Student("Katie", "Gott", 1, "some tutor")
            print(katie.id)
        }
    }
}
abstract class Person(var firstName:String, var lastName:String) {

    open fun getName() : String = "$firstName $lastName"
    abstract fun getAddress(): String
    }

open class Student(firstName:String, lastName:String, _id: Int, var tutor:String = ""): Person(firstName, lastName) {
    val id: Int

    init {
        id = _id
    }

    fun enroll(courseName: String) {
        val course = Courses.allCourses
            .filter { it.Title == courseName }
            .firstOrNull()
    }

    override fun getAddress(): String {
        return ""
    }

    override fun getName(): String {
        return ""
    }

    companion object {
        fun createUndergraduate(name: String): Undergraduate {
            return Undergraduate(name)
        }

        fun createPostGraduate(name: String): Graduate {
            return Graduate(name)
        }
    }
}
class Undergraduate(firstName: String) : Student(firstName, "", 1) {

}
class Graduate(firstName: String) : Student(firstName, "", 1) {
}

interface XmlSerializer<T> {
    fun toXml(item: T)
}