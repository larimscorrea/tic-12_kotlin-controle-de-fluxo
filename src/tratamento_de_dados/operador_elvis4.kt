package tratamento_de_dados

fun saudacao(nome: String?): String {
    return nome ?: "Olá, estranho!"
}

val mensagem = saudacao(null)

println(mensagem) // Imprime "Olá, estranho!"
