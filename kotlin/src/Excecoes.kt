fun main() {
    try {
        val s: String? = null
        val a = 10/0
        println(s!!.length)

    }catch (e: NullPointerException){
        println("Variavel Nula")
    }catch (e: ArithmeticException){
        println("Impossivel dividir por 0")
    }finally {
        println("Finally" +
                "")
    }
    println("Fim")
}