fun main() {
    val str = "Programação Kotlin"

    println("Tamanho da string: ${str.length}")

    println("Posição 0 da string: ${str[0]}")

    println(str.startsWith("Pro"))

    println(str.endsWith("ABC"))

    println(str.replace("Kotlin", "Kotlin é show"))

    println(str.lowercase())

    println(str.uppercase())

    println("               meu nome é".trim())
}