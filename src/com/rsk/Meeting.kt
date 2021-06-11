package com.rsk

class Meeting(val id: Int, val title: String) {
    val people = listOf(Person1("Sam"), Person1("Alex"))
}

data class Person1(val name: String) {

}
