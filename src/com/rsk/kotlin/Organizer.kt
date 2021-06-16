package com.rsk.kotlin

import com.rsk.java.OrgMeeting

fun main(args: Array<String>) {
    val m = OrgMeeting()

    val title: String? = m.meetingTitle()

    println(title)
}