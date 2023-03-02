fun main() {

    //  lambda = {Parametro -> corpo}
    recebeA { println("Hello") }

    recebaB { x: Int -> println(x * x) }

    recebaC { x: Int, y: Int ->
        println("Executando")
        println(x * y)
    }
}

fun recebeA(lambda: () -> Unit) {
    lambda()
}

fun recebaB(lambda: (x: Int) -> Unit) {
    lambda(5)
}

fun recebaC(lambda: (x: Int, y: Int) -> Unit) {
    lambda(5, 2)
}
