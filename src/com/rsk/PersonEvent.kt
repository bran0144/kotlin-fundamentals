package com.rsk

sealed class PersonEvent {
    class Awake: PersonEvent()
    class Asleep: PersonEvent()
    class Eating(val food: String) : PersonEvent()
}

fun handlePersonEvent(event: PersonEvent) {
    when(event) {
        is PersonEvent.Awake -> println("awake")
        is PersonEvent.Asleep -> println("asleep")
        is PersonEvent.Eating -> println(event.food)
    }
}