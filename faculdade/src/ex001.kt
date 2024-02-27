fun media(nota1: Float, nota2: Float, notaTrabalho: Float): Float {
    val media = (nota1 + nota2 + notaTrabalho) / 3

    if (media >= 7) {
        println("Aprovado")
    } else if (media >= 5 && media < 7) {
        println("Recuperação")
    } else {
        println("Reprovado")
    }

    return media
}

fun main() {
    println(media(5f, 5f, 8f))
}