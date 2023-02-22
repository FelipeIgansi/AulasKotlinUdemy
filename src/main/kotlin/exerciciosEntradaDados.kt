fun main() {
    print("Lado 1:  ")
    val l1 = readlnOrNull()
    print("Lado 2:  ")
    val l2 = readlnOrNull()
    print("Lado 3:  ")
    val l3 = readlnOrNull()
    quadrado(l1, l2, l3)
}

fun quadrado(a: String? = "", b: String? = "", c : String? = "") {
    if (a == b && a == c)
        println("É um triangulo equilátero!")
    else
        println("Não é um triangulo equilátero!")
}