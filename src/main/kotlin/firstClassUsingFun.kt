fun main() {
    helloWorld()
    println("A soma de 1 + 2 é: ${sum(1,2)}")
    println( "A divisão do numero 10 por 3.5 é: ${divisao(10f, 3.5f)}")
}

fun divisao(dividendo: Float, divisor: Float) =  dividendo/divisor

fun sum(a: Int, b: Int): Int {
    return a + b
}
// Função em uma linha
fun sum2 (a: Int, b: Int) = a+b//quando o retorno é o mesmo dos tipo de variaveis ele não precisa ser mencionado

fun helloWorld() = println("Hello, world!")
