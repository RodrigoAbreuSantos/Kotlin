//coleção => conjunto de elementos
//List, Set, Map

fun main() {
    val lst1: List<Int> = listOf(1,2,3,4,5)//não pode ser modificada

    val lst2: MutableList<Int> = mutableListOf(1,2,3,4,5) //pode ser modificada

    println(lst2[0])
    lst2.add(8)
    lst2.remove(8)
    lst2.removeAt(0)
    println(lst2)
    println(lst2.contains(1))
}
