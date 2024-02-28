class Animal(var especie: String){

    var fala: String = ""

        get() {
            println("Acesso get")
            return field //não vai criar um lopping infinito com fala
        }
        set(value) {
            println("Acesso set")
            field = value
        }

    init { //é um bloco que vai ser executado quando a classe for criada,
        // ele executa todos os init e executa na sequencia
        println("init 1")
        if (especie == "cachorro"){
            fala = "au"
        }else if (especie == "gato"){
            fala = "miau"
        }else{
            fala = ""
        }
    }
    init {
        println("init 2")
    }

    fun falar(){
        println(fala)
    }
}

fun main() {
   var animal =  Animal("cachorro")

    animal.falar()
}