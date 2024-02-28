//public -> todos podem acessar
//protected -> ele da acesso a classe e a classe que herdam a classe
//private -> visto apenas pela classe que esta

//override -> sobreescreve uma função,
//então se vc tiver herdando um metodo vc pode sobreescrever ele usando o override

open class Eletronico(var marca: String){
    private fun ativarCorrenteEletrica(ativo: Boolean){}
    fun ligar(){
        ativarCorrenteEletrica(true)
    }

    open fun desligar(){
        ativarCorrenteEletrica(false)
    }
}

class Computador(marca: String): Eletronico(marca){

    override fun desligar(){
        save()
        super.desligar()
    }

    fun save(){}

    fun save(a: Int){}
    fun save(a: Float){}
    fun save(a: Double){}

}

fun main() {
    var c: Computador = Computador("Dell")

    c.marca
    c.ligar()
    c.desligar()

    //c.ativarCorrenteEletrica()

}