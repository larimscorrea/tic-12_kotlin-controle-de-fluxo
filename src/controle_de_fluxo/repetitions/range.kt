package controle_de_fluxo.repetitions

fun main() {
    // Verificando se um número está em um range
    val numero = 3
    val range = 1..5
    if (numero in range) {
        println("$numero está dentro do range $range")
    } else {
        println("$numero não está dentro do range $range")
    }

    // Iterando sobre um range
    for (i in 2..10 step 2) {
        println(i)
    }

    // Acessando primeiro e último elemento
    val alfabeto = 'a'..'z'
    println("Primeira letra: ${alfabeto.first}")
    println("Última letra: ${alfabeto.last}")
}
