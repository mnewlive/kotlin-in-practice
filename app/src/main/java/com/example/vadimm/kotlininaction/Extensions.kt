val String.lastChar: Char
    get() = get(length - 1)

var StringBuilder.lastChar: Char
    get() = get(length - 1)
    set(value) {
        this.setCharAt(length - 1, value)
    }

fun main(args:Array<String>) {
    val someString = "Vadim Krasava ae"
    println(someString.lastChar)
    val anotherString = StringBuilder("Vadim moget?")
    anotherString.lastChar = '!'
    println(anotherString)
}