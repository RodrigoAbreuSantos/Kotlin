fun main() {

    //chave e valor associado

    val map1: Map<String, String> = mapOf<String, String>(Pair("França", "Paris"), Pair("Alemanha", "Berlim"))//para definir o tipo do map,
    // vc precisa definir o tipo da chave e o tipo do valor. A chave é França e o valor é Paris

    val map2: MutableMap<String, String> = mutableMapOf<String, String>()

    println(map1.entries)
    println(map1.values)
    map2["Brasil"] = "Brasilia"
    println(map2)
    map2.remove("Brasilia")
}