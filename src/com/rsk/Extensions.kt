package com.rsk

fun main(args: Array<String>) {
    val text = "With     multiple \t whitespace"
    println(text)
}

fun replaceMultipleWhiteSpace(value: String) : String {
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}