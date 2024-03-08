interface Funcionario {
    var salario: Float
    fun bonus(): Float
}

class Gerente(override var salario: Float): Funcionario {
    override fun bonus(): Float {
        return salario * 0.5f
    }
}

class Analista(override var salario: Float): Funcionario{
    override fun bonus(): Float {
        return salario * 0.3f
    }
}

fun mostraBonus(f: Funcionario){
    println(f.bonus())
}


fun main() {
    mostraBonus(Gerente(10000f))
    mostraBonus(Analista(8000f))

    val p = Programa()

    p.salvar(object: Event{
        override fun onSuccess() {
            println("onSuccess")
        }
    })
}

interface Event {
    fun onSuccess()
}

class Programa {
    fun salvar(e: Event){
        println("Abrindo Conexões")
        println("Salvando Valores")
        println("Suceso. Conexões Fechadas")
        e.onSuccess()
    }
}
