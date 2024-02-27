fun main() {

    val str = "dbiudboidboaonddpa"
    var i = 0
    var w = 0
    while (i < 100000000){
        if (i == 50){
            break
        }
        print("$i ")
        i++
    }
    println()
    

    while (w < 80){
        if (i < 50){
            w++
            continue
        }
        print("$w ")
        w++
    }
}