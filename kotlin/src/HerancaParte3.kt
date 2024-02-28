interface Selvagem {
    fun atacar()
}

abstract class Mamifero(val nome: String){
    fun acordar(){}

    fun dormir(){}

    abstract fun falar()
    abstract fun comer()
}

class Cachorro(nome: String): Mamifero(nome), Selvagem { //cachorro herda de mamifero
    override fun falar() {
        println("au au")
    }

    override fun atacar() {
        println("Morder")
    }


    override fun comer() {
        println("Ração")
    }
}

fun main() {
    val m: Cachorro = Cachorro("Rony")
    m.falar()
    m.comer()
    m.atacar()
}