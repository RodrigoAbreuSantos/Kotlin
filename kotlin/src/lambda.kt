// {parametro -> corpo}

fun main() {
    val a = { println("Hello") }

    a()

    val b = { x: Int -> x * x }
    b(10)

    receiveB {  x: Int -> x * x }
    receiveB(b)

    val c = { x: Int, y: Int ->
        println("Executando")
        x * y
    }

    c(5, 15)

    receiveC(c)

    receiveC { x: Int, y: Int ->
        println("Executando")
        x * y }
}

fun receiveA(lambda: () -> Unit){
    lambda()
}

fun receiveB(lambda2: (x: Int) -> Int){}

fun receiveC(lamb: (b1: Int, b2: Int) -> Int){}