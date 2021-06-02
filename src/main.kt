import com.rsk.Person

fun main(args: Array<String>) {
    println("hello, world")

    val kevin = Person("Kevin")

    println("Name is ${kevin.Name}")

    kevin.displayWithLambda(::printName)

    kevin.display()
}
fun printName(name: String) {
        println(name)
    }

