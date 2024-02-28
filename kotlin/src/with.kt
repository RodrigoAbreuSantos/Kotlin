fun main() {
    val pessoaCriadaParaExecucaodeTeste = Pessoa(1985, "frank")
    pessoaCriadaParaExecucaodeTeste.acordar()
    pessoaCriadaParaExecucaodeTeste.dormir()

    with(pessoaCriadaParaExecucaodeTeste){
        acordar()
        dormir()
    }

}
