package com.rsk

fun main(args: Array<String>) : Unit {
    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "Committee Meeting"))
    val titles = meetings
        .asSequence()
        .filter{it -> it.title.startsWith("C")}
        .map{m -> m.title}

    for (t in titles) println(t)
}
class Meeting(val id: Int, val title: String) {
    val people = listOf(Person1("Sam"), Person1("Alex"))
}

data class Person1(val name: String) {

}
