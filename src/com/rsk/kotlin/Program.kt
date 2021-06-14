package com.rsk.kotlin

import com.rsk.java.User

fun main(args: Array<String>){
    var user = User("Katie")

    user.create{println("User $it has been created")}
}