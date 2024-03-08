fun main() {
    val set1: Set<String> = setOf<String>("Paris", "Berlim", "Madrid") //imutavel
    val set2: MutableSet<String> = mutableSetOf<String>() //mutavel

    //a lista é um conjunto ordenado,
    // então quando vc vai adicionando elementos vc vai adicionando ao final da lista

    //o set não tem uma sequencia ordenada e ele não permite valores duplicados

    set2.add("São Paulo")


    println(set1)
}