fun main() {
    endereco("Street", "city", "sp", "13404")
    println(media(10f, 8f, 7f, 5f))
    println(media2(10f, 10f, 8f, 5, "Ola"))

    arrayOf(2,2,3,6,45f, false)
}

fun endereco(rua: String, cidade: String, estado: String, cep: String, num: Int = 0){
    println("$rua, $cidade, $estado, $cep, $num")
}

fun media(vararg notas: Float, ): Float{
    var soma = 0f

    for (nota in notas){
        soma = soma + nota
    }
    return soma / notas.size
}

//Generics
fun <T, J> media2(abc: J, vararg notas: T ): Float{
    var soma = 0f
    var i = 0

    for (nota in notas){
        if (nota is Float){
            soma = soma + nota
            i++
        }
    }
    return soma / i
}