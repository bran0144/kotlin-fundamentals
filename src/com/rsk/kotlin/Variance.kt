package com.rsk.kotlin

fun main(args: Array<String>) {
    var financialMeeting = mutableListOf(FinanceMeeting())
    var varMeetings: AllMeetings<FinanceMeeting> = AllMeetings(financialMeeting)

    attendAllMeetings(varMeetings)
}
class AllMeetings<out T: ReifiedMeeting> (val varMeetings: List<ReifiedMeeting>){
    val count: Int get() : varMeetings.count()

    operator fun get(i: Int) = varMeetings[i]

}

fun attendAllMeetings( meetings: AllMeetings<ReifiedMeeting>) {
    for(i in 0 until meetings.count) {
        meetings[i].attend()
    }
}