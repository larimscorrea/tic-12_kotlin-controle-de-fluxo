package tratamento_de_dados

val lista: List<Int>? = obterLista()
val soma = lista?.sum() ?: 0

println("Soma da lista: $soma")
