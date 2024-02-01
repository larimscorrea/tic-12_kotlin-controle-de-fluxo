package first_questions
//Crie um programa que armazene um vetor de 10 nomes de
//pessoas e as imprima conforme foram indexadas.

fun main() {
    // Declaração do vetor
    val nomes = Array(10) { "" }

    // Coleta dos nomes das pessoas
    for (i in 0 until nomes.size) {
        print("Digite o nome da pessoa ${i + 1}: ")
        nomes[i] = readLine() ?: ""
    }

    // Impressão dos nomes
    for (i in 0 until nomes.size) {
        println("Nome da pessoa ${i + 1}: ${nomes[i]}")
    }
}
