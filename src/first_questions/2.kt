package first_questions

//Crie um programa que retorne a situação de um aluno,
//baseado em uma função que calcula a média de 4 notas (parâmetros)
//e verifique se essa média está:
fun main() {
    // Declaração das variáveis
    var nota1: Int = 0
    var nota2: Int = 0
    var nota3: Int = 0
    var nota4: Int = 0

    // Coleta das notas do aluno
    print("Digite a primeira nota: ")
    nota1 = readLine()?.toIntOrNull() ?: 0

    print("Digite a segunda nota: ")
    nota2 = readLine()?.toIntOrNull() ?: 0

    print("Digite a terceira nota: ")
    nota3 = readLine()?.toIntOrNull() ?: 0

    print("Digite a quarta nota: ")
    nota4 = readLine()?.toIntOrNull() ?: 0

    // Validação das notas
    if (nota1 > 10 || nota1 < 0) {
        println("Nota inexistente")
        return
    } else if (nota2 > 10 || nota2 < 0) {
        println("Nota inexistente")
        return
    } else if (nota3 > 10 || nota3 < 0) {
        println("Nota inexistente")
        return
    } else if (nota4 > 10 || nota4 < 0) {
        println("Nota inexistente")
        return
    }

    // Cálculo da média
    val media = (nota1 + nota2 + nota3 + nota4) / 4.0  // Use 4.0 to force Double division


    when (media) {
        in 7.0..10.0 -> println("Aprovado")
        in 4.0..6.9 -> println("Recuperação")
        else -> println("Reprovado")
    }

}
