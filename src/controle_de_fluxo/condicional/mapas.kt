package controle_de_fluxo.condicional

fun main(){
    val diaParaNumero = mapOf(
        "Segunda" to 1,
        "Terça" to 2,
        // ... demais dias
    )

    val diaEscolhido = "Terça"
    val numeroDia = diaParaNumero[diaEscolhido]

    if (numeroDia != null) {
        val mensagem = "Terça é o " + numeroDia + "º dia da semana."
        println(mensagem)
    } else {
        println("Dia inválido.")
    }

}
