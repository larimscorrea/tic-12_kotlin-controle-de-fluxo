package tratamento_de_dados

fun main() {
    val nome: String? = null
    val nomeCompleto = nome ?: "Usuário Desconhecido"

    println("Nome completo: $nomeCompleto") // Imprime "Usuário Desconhecido"

}


