package tratamento_de_dados

//Calculando a área de um retângulo.
fun areaRetangulo(base: Int?, altura: Int?): Int? {
    if (base == null || altura == null) {
        return null
    }

    return base * altura
}

fun main() {
    val base = readLine()?.toInt()
    val altura = readLine()?.toInt()

    val area = areaRetangulo(base, altura)

    if (area != null) {
        println("A área do retângulo é $area")
    } else {
        println("Erro ao calcular a área.")
    }
}
