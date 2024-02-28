fun main() {

    //objeto(f1) -> endereço de memoria
    //objeto(f2) -> endereço de memoria

    val f1: FormaData = FormaData(1, 10)
    val f2: FormaData
    f2 = f1.copy()
    println(f1.equals(f2))//esta comparando o endereço de memoria
    println(f1.toString())
    println(f1.hashCode())
    println("--------------------------")
    println(f2.toString())
    println(f2.hashCode())
}

class Forma(val a: Int, val b: Int){

}

data class FormaData(val a: Int, val b: Int){}

data class Endereco(val rua: String, val cep: String, val city: String)

fun endereco(end: Endereco){

}