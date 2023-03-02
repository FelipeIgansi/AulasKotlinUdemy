//Const é uma top level declaration, ou seja, só pode ser declarada fora do escopo da classe

const val t1 = 10

// outro cenário
// const não pode ter seu valor dependendo de uma função. Seu valor deve ser inicializado e constante

val j = hello()
//const val k = hello() // Dá erro

fun hello() = "Hello!"

class const {
    // const não funciona aqui e nem é lista pelo intelicense
    // Para um valor constante dentro da classe é usado apenas o val
    val t2 = 2
    companion object{
        const val t3 = 1 // dentro de compenion objects
    }
}