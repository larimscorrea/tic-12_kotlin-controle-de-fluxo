package tratamento_de_dados

fun main() {
    val cliente: Cliente? = buscarClientePorId(10)
    val email = cliente?.email ?: "Email não encontrado"

    println("Email do cliente: $email")

}

