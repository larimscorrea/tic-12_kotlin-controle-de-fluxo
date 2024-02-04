package controle_de_fluxo

fun String.maiuscula(): String {
    return this.toUpperCase()
}

fun main() {
    val texto = "olá, mundo!"

    val textoMaiusculo = texto.maiuscula()

    println(textoMaiusculo) // Imprime "OLÁ, MUNDO!"
}


