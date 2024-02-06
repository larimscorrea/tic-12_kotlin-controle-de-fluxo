package tratamento_de_dados

//Lendo um nome de usuário
fun main() {
    val nome = readLine()

    if (nome != null) {
        println("Bem-vindo, $nome!")
    } else {
        println("Nome inválido.")
    }
}
