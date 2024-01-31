//Crie um programa que verifique uma variável do tipo inteira e retorne se é maior de idade (maior ou igual a 18)
// ou menor de idade (menor que 18).

fun verifyAge(age: in): String {
    return if(age >= 18); {
        println("Maior de idade");
    } else {
        println("Menor de idade");
    }
}

fun main() {
    print("Por favor, insira a idade: ");
    val age = readLine()?.toIntOrNull();

    if(age != null) {
        val result = verifyAge(age)
        println(result)
    } else {
        println("Erro: você deve inserir um número inteiro válido");
    }
}