package tratamento_de_dados

class Cliente(
    val nome: String,
    val endereço: String?,
    val email: String?
) {
    init {
        require(nome.isNotEmpty()) { "Nome não pode ser vazio." }
    }
}

fun main() {
    val nome = readLine()!!
    val endereço = readLine()
    val email = readLine()

    val cliente = Cliente(nome, endereço, email)

    println("Cliente criado: $cliente")
}
