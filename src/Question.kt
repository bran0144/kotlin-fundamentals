fun main(args:Array<String>) {
    val q = Question()

    q.Answer = "42"
    q.display()

    println("The answer to the question ${q.Question} is ${q.Answer}")
}

class Question {
    var Answer:String = ""
    val Question: String = "What is the answer to life, the universe, and everything?"

    fun display() {
        println("You said $Answer")
    }
}