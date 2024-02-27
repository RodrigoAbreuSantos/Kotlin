fun main() {
    var i = 0
    var x = 0
    var w = 0
    val s = "Kotlin"
    while (i < 20){
        print("$i ")
        i++
    }

    println()

    while (x < s.length){
        print("${s[x]}")
        x++
    }

    println()

    do{
        print("$w ")
        w++
    }while (w < 20)
}