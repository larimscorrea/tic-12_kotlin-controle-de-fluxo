package first_questions

//Crie um programa que contenha funções chamando outras
//funções seguindo a ordem hierárquica de classificação dos números:
//o Números reais contêm os números racionais, os racionais
//contêm os números inteiros, os números inteiros contêm os
//números naturais. (Uma função chamando a outra nessa
//ordem).
//o Imprima mensagens de sequenciamento para identificar e lhe
//dar a certeza que uma função chamou a outra com sucesso.

fun main() {
    // Chama a função númerosReais()
    númerosReais()
}

fun númerosReais() {
    // Imprime uma mensagem de sequenciamento
    println("Chamada da função númerosReais()")

    // Chama a função númerosRacionais()
    númerosRacionais()
}

fun númerosRacionais() {
    // Imprime uma mensagem de sequenciamento
    println("Chamada da função númerosRacionais()")

    // Chama a função númerosInteiros()
    númerosInteiros()
}

fun númerosInteiros() {
    // Imprime uma mensagem de sequenciamento
    println("Chamada da função númerosInteiros()")

    // Chama a função númerosNaturais()
    númerosNaturais()
}

fun númerosNaturais() {
    // Imprime uma mensagem de sequenciamento
    println("Chamada da função númerosNaturais()")
}
