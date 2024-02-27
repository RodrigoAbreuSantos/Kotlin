fun main() {
    helloworld()
    println(sum(10, 5))
    println(sum2(15, 5))
}

fun helloworld(): Unit{
    println("Hello, world!")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sum2(a: Int, b: Int): Int = a + b
