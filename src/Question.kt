fun main(args:Array<String>) {
    val q = Question()

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
}

class Question {
    var Answer:String? = null
    val CorrectAnswer = "42"
    val Question: String = "What is the answer to life, the universe, and everything?"

    fun display() {
        println("You said $Answer")
    }
}