package first_questions

//Crie uma função que leia uma variável do tipo inteira, verifique
//se essa variável contém um número primo ou não.

fun ehPrimo(numero: Int): Boolean {
    // Verifica se o número é menor que 2
    if (numero < 2) {
        return false
    }

    // Itera pelos números de 2 até a raíz quadrada do número
    for (i in 2 until Math.sqrt(numero.toDouble()).toInt()) {
        // Se o número for divisível por um dos números, ele não é primo
        if (numero % i == 0) {
            return false
        }
    }

    // O número é primo
    return true
}
