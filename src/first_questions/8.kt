package first_questions
//Crie um algoritmo que converte horas em horas e minutos e
//minutos para horas e minutos. Atribua os valores a variáveis do tipo
//inteiras.

fun main() {
    // Convertendo horas em horas e minutos
    val horasTotais = 4
    val horas = horasTotais / 60
    val minutos = horasTotais % 60
    println("$horasTotais horas é equivalente a $horas horas e $minutos minutos.")

    // Convertendo minutos em horas e minutos
    val minutosTotais = 130
    val horasConvertidas = minutosTotais / 60
    val minutosRestantes = minutosTotais % 60
    println("$minutosTotais minutos é equivalente a $horasConvertidas horas e $minutosRestantes minutos.")
}

