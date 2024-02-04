package controle_de_fluxo

fun calcularArea(base: Int, altura: Int): Int {
    return base * altura
}

fun main() {
    val area = calcularArea(10, 5)

    println(area) // Imprime 50
}

