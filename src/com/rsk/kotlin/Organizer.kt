package com.rsk.kotlin

import com.rsk.java.OrgMeeting

fun main(args: Array<String>) {
    val m = OrgMeeting()
//    m.addTitle("Title")
//    m.addTitle(null)
//
//    val title: String? = m.meetingTitle()
//
//    println(title)

    val title: String = m.titleCanBeNull() ?: "nobody"
    println(title)
}