package controle_de_fluxo.condicional

fun main() {
    val mes = 5

    val estacao = when (mes) {
        12, 1, 2 -> "Inverno"
        3, 4, 5 -> "Primavera"
        6, 7, 8 -> "Verão"
        9, 10, 11 -> "Outono"
        else -> "Mês inválido"
    }

    println("Estação: $estacao")
}
