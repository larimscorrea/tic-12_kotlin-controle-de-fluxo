package first_questions

//Crie um programa que lê um vetor de Double de 10 elementos
//e pesquisa um número dentro desse vetor. Retorne “Elemento x achado”
//caso pertença ao vetor ou “Elemento x não achado” caso não pertença ao
//vetor.

import kotlin.math.sqrt // Exemplo de importação para a função sqrt

fun main() {
    // Cria um vetor de Double com 10 elementos
    val vetor = DoubleArray(10)

    // Lê os elementos do vetor
    for (i in 0 until vetor.size) {
        println("Digite o ${i + 1}º elemento do vetor: ")
        vetor[i] = readLine()!!.toDouble()
    }

    // Lê o número a ser pesquisado
    print("Digite o número a ser pesquisado: ")
    val numero = readLine()!!.toDouble()

    // Busca o número no vetor
    var encontrado = false
    for (i in 0 until vetor.size) {
        if (vetor[i] == numero) {
            encontrado = true
            break
        }
    }

    // Exibe o resultado da pesquisa
    if (encontrado) {
        println("Elemento $numero achado no vetor.")
    } else {
        println("Elemento $numero não achado no vetor.")
    }
}
