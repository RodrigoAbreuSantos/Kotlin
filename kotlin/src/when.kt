fun bonus(cargo: String): Float{
    var bonus = 0f

    if (cargo == "Gerente"){
        bonus = 2000f
    }else if (cargo == "Coordenador"){
        bonus = 1500f
    }else if (cargo == "Engenheiro de software"){
        bonus = 1000f
    }else if (cargo == "Estagiario"){
        bonus = 500f
    }

    return  bonus
}

fun bonusWhen(cargo: String): Float{
    var bonus = 0f
    when (cargo){
        "Gerente" -> {
            bonus = 2000f
        }
        "Coordenador" -> {
            bonus = 1500f
        }
        "Software" -> {
            bonus = 1000f
        }
        "Estagiario" -> {
            bonus = 500f
        }
        else -> 0f

    }

    return bonus
}

fun main() {
    println(bonusWhen("Estagiario"))
}