fun main() {
    val str: String? = null

    if (str == null){
        println("Nullo")
    }else{
        println(str)
    }

    println(str ?: "nullo")

    //    ? if verdadeiro             : if falso

    str?.let {
        it.lowercase()
        it.length
    }
}