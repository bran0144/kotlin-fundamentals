package com.rsk.kotlin

import com.rsk.java.Created
import com.rsk.java.User

fun main(args: Array<String>){
    var user = User("Katie")

    var count = 0

    var eventListener = Created{ println("User $it has been created: ${++count} times")}

    user.create{eventListener}
    user.create{println("User $it has been created: ${++count} times")}
}