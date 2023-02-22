fun main() {
    val str: String? = null
    if (str == null) {
        println("nulo")
    } else {
        println(str)
    }

    println(str ?: "nulo")// Esse operador simplifica o if ali em cima
    // se o str for nullo ele retorna a instrução "nulo", mas ser substituido por basicamente qualquer coisa
    // ISSO NÃO É TERNÁRIO
    //Ternário no Kotlin seria algo assim:

    val valor = 18
    val s = if (valor > 18) "Maior de idade" else "Menor de idade"
}