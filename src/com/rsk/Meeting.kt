package com.rsk

import java.util.*

class Meeting {
    var Title: String = ""
    var When: Date = Date()
    var Who = mutableListOf<String>()

    fun create(){}
}

fun main(args: Array<String>) {
    val m = Meeting()
    m.Title = "Board meeting"
    m.When = Date(2018, 1,1)
    m.Who.add("Katie")

    with(m) {
        Title = "Board Meeting"
        When = Date(2018, 1, 1)
        Who.add("Katie")
    }

    m.apply{
        Title = "Board Meeting"
        When = Date(2018, 1, 1)
        Who.add("Katie")
    }.create()
}