package first_questions

//Crie um programa que verifique se um número é primo
//(Estruturas de repetição)

fun main() {
    // Declaração da variável
    var numero: Int = 0

    // Coleta do número do usuário
    print("Digite um número: ")
    numero = readLine()?.toIntOrNull() ?: 0

    // Verificação se o número é primo
    if (numero < 2) {
        println("Número não é primo")
        return
    }

    // Iteração pelos números de 2 até a raíz quadrada do número
    for (i in 2..Math.sqrt(numero.toDouble()).toInt()) {
        // Se o número for divisível por um dos números, ele não é primo
        if (numero % i == 0) {
            println("Número não é primo")
            return
        }
    }

    // O número é primo
    println("Número é primo")
}
