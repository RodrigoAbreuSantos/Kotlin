fun main() {
    val num = 19

    if(num > 10 && num < 18){
        println("Adolescente")
    }else if(num > 5 && num < 10){
        println("Criança")
    }else if(num >= 0 && num < 5){
        println("Bebe")
    }else{
        println("Adulto")
    }
}