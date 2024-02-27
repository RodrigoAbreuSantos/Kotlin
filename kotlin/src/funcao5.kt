fun main() {
    //Any, Unit e Nothing
    valores(false, 10, 5f, "teste")
}

fun valores(vararg values: Any){

    for (value in values){
        println(value)
    }
}

