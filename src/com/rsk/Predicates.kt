package com.rsk

fun main(args: Array<String>) : Unit {


    val meetings = listOf(Meeting(1, "Board Meeting"), Meeting(2, "CommitteeMeeting"))

    val people: List<Person1> = meetings
        .flatMap(Meeting::people)
        .distinct()

    for (p in people) println(p.name)
//    val ints = listOf(1,2,3,4,5)
//    val greaterThan3 = {v:Int -> v > 3}
//
//    var largeInts = ints.all(greaterThan3)
//
//    println(largeInts)
//
//    largeInts = ints.any(greaterThan3)
//
//    println(largeInts)
//
//    var numberOfLargeInts = ints.count(greaterThan3)
//
//    println(numberOfLargeInts)
//
//    var found = ints.find(greaterThan3)
//
//    println(found)
}