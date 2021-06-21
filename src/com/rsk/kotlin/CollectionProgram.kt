package com.rsk.kotlin

import com.rsk.java.NewMeeting
import com.rsk.java.NewOrganizer
import java.lang.UnsupportedOperationException

fun main(args: Array<String>) {
    var people : MutableList<Person?>? = null

    people = mutableListOf(Person(23),Person(23), null)

    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }
}
class Person(val age: Int) : NewOrganizer{
    override fun processMeetings(meetings: MutableList<NewMeeting>) {
        throw UnsupportedOperationException("Not implemented")
    }

}