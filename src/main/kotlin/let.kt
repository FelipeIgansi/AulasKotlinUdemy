fun main() {
    val str :String? = null
    str?.let {
        // Dentro do escopo desse método o str virá 'it'
        // corpo
        // Só executa se o str não for nulo
        // é um if else disfarçado
    }
}