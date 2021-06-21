package com.rsk.kotlin

fun main(args: Array<String>) {
    var people : MutableList<Person?>? = null

    people = mutableListOf(Person(23),Person(23), null)

    people.add(null)

    for (person: Person in people.filterNotNull()) {
        println(person.age)
    }
}
class Person(val age: Int) {

}