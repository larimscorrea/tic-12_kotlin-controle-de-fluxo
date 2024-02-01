package first_questions

//Crie uma função que imprima os 8 primeiros números da
//sequência de Fibonacci (inicie pelo número 1). Contemple a lógica dessa
//sequência no algoritmo.

fun main() {
    printPrimeiros8Fibonacci()
}

fun printPrimeiros8Fibonacci() {
    var num1 = 0
    var num2 = 1
    var contador = 0

    print("Os 8 primeiros números da sequência de Fibonacci são: ")

    while (contador < 8) {
        print("$num1 ")
        val soma = num1 + num2
        num1 = num2
        num2 = soma
        contador++
    }
}
