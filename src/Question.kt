import java.lang.NumberFormatException

fun main(args:Array<String>) {
    val q:Question = Question()

    q.Answer = null
    if(q.Answer != null) {}
    q.Answer = "42"
    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")

    var message = if(q.Answer == q.CorrectAnswer) {
        "You were correct"
    } else{
        "Try again"
    }
    println(message)
    q.printResult()

    val number:Int = try{
        Integer.parseInt(q.Answer)
    } catch(e:NumberFormatException) {
        -1
    }

    println("Number is $number")
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