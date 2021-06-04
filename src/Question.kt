import java.io.FileReader
import java.io.IOException
import java.lang.NumberFormatException
import java.util.*

fun main(args:Array<String>) {

    var reader = FileReader("filename")

    try {
        reader.read()
    }catch(e : IOException){
    }finally {

    }

//    for (i in numbers)  {
//        println(i)
//    }
}
fun ranges(){
    var numbers = listOf(1, 2, 3, 4, 5)

    var ages = TreeMap<String, Int>()
    ages["Sam"] = 24
    ages["Stewart"] = 40
    ages["Sally"] = 33
    ages["Sue"] = 55

    for((name, age) in ages){
        println("$name is $age")
    }
    for((index, element) in numbers.withIndex()) {
        println("$element at $index")
    }
//    var range = 'a'..'z'

//    val q:Question = Question()
//
//    q.Answer = null
//    if(q.Answer != null) {}
//    q.Answer = "42"
//    q.display()
//
//    println("The answer to the question ${q.Question} is ${q.Answer}")
//
//    var message = if(q.Answer == q.CorrectAnswer) {
//        "You were correct"
//    } else{
//        "Try again"
//    }
//    println(message)
//    q.printResult()
//
//    val number:Int = try{
//        Integer.parseInt(q.Answer)
//    } catch(e:NumberFormatException) {
//        -1
//    }
//
//    println("Number is $number")
}

class Question {
    var Answer:String? = "42"
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe, and everything?"

    fun display() {
        println("You said $Answer")
    }
    fun printResult() {
        when (Answer) {
            CorrectAnswer -> print("You were correct")
            else -> print("Try again?")
        }
    }
}