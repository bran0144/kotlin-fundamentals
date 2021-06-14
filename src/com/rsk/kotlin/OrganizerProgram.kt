package com.rsk.kotlin

fun main(args: Array<String>) {
    var m:Meeting? = null
    var newMeeting = Meeting()

//    newMeeting = m
    closeMeeting(m)
    closeMeeting(newMeeting)
}

fun closeMeeting(m: Meeting?): Boolean? {
//    return if (m?.canClose == true) m?.close()
//    else false
    return if (m!!.canClose) m.close()
    else false
}
class Meeting {
    val canClose: Boolean = false

    fun close(): Boolean {
        return true
    }
}