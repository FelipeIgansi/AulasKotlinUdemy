import java.lang.Exception

fun main() {
    try {
        val s: String? = null
        println(s!!.length)

        // Exemplo:
        // val db = Banco.open() // Nesse caso a conexão com o banco será aberta e caso der ruim nunca será fechada,
                                // por isso usa-se o finaly para sempre fechar a conexão
        // db.save()
    }catch (e: NullPointerException){
        println("Variavel nula!")
    }catch (e: ArithmeticException) {
        println("Impossivel dividir por 0")
    }catch (e: Exception){// Excessão genérica e se ela for a primeira da lista ela sempre será executada, pois ela é o pai todas as outras são variações dela
        println("Genérica")
    }
    finally {// SEMPRE será executado
//        db.close()
    }
    println("Fim!")
}