//Existe 2 tipos de contrutores em uma classe o () e o constructor

class Pessoa(val anoNascimento: Int, var nome: String){

    var doc: String? = null

    constructor(anoNascimento: Int, nome: String, doc: String): this(anoNascimento, nome){
        this.doc = doc
    }
    fun dormir(){

    }

    fun acordar(){

    }
}

class Vazia private  constructor()

//classe - comportamento e atributos
//classe -> objetos
//this -> se refere ao objeto
fun main() {

    var pessoa: Pessoa = Pessoa(2000, "Fulano", "272828292")//vc esta instanciando a classe pessoa,
                                 // quando vc instancia vc gera objetos

    println(pessoa.nome)
    pessoa.dormir()
    pessoa.acordar()
    println(pessoa.doc)
}