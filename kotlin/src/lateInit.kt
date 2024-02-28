class Receita{
    //var instrucoes: String? = null
    lateinit var instrucoes: String //fala que posteriormente tera valor

    fun geraReceita(){
        instrucoes = "Lave as Mãos"
    }

    fun imprimiReceitas(){
        if (!this::instrucoes.isInitialized){
            instrucoes = "lave as mãos"
        }
    }
}

fun main() {

    var r: Receita = Receita()
    r.geraReceita()
    println(r.instrucoes)
    r.imprimiReceitas()
    println(r.instrucoes)
}
