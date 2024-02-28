//enum -> a classe enum limita os valores, limita o intervalo de valores

enum class Prioridade (val id: Int){
    Baixa(1),
    Media(5),
    Alta(15)
}

enum class AnimalEnum {
    Cachorro, Gato, Cavalo, Vaca, Tartaruga
}

fun main() {
    for (p in Prioridade.values()){
        println("$p - ${p.id}")
    }
}