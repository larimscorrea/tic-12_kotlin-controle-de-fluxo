package first_questions

//Crie uma matriz 4x4 do tipo Float, imprima as seguintes
//informações:
//
//o Quantidade de colunas, através de comandos da matriz;
//o Quantidade de linhas, através de comandos da matriz;
//o Os elementos que compõe a matriz.

fun main() {
    // Declaração da matriz
    val matriz = Array(4) { Array(4) { 0f } }

    // População da matriz
    for (linha in 0 until matriz.size) {
        for (coluna in 0 until matriz[linha].size) {
            matriz[linha][coluna] = (linha + coluna).toFloat()
        }
    }

    // Impressão da quantidade de colunas
    println("Quantidade de colunas: ${matriz.size}")

    // Impressão da quantidade de linhas
    println("Quantidade de linhas: ${matriz[0].size}")

    // Impressão dos elementos da matriz
    for (linha in 0 until matriz.size) {
        for (coluna in 0 until matriz[linha].size) {
            println("matriz[${linha}][${coluna}] = ${matriz[linha][coluna]}")
        }
    }
}
