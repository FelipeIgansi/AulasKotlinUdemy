fun main() {
    println("Gerente:  ${bonus("Gerente")}")
    println("Coordenador:  ${bonus("Coordenador")}")
    println("Eng.Software:  ${bonus("Eng.Software")}")
    println("Estágiario:  ${bonus("Estagiario")}")
}

fun bonus(cargo: String): Float {
    var bonus = 0f
    when (cargo) {// Isso é LINDO D+ <3
        "Gerente" -> bonus = 2000f
        "Coordenador" -> bonus = 1500f
        "Eng.Software" -> bonus = 1000f
        "Estagiario" -> bonus = 500f
    }
    return bonus
}
fun bonus2(cargo: String, experiencia: Int): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Coordenador" -> 1500f
        "Eng.Software" -> 1000f
        "Estagiario" -> 500f
        else -> 0f // Valor default só será executado caso nenhuma das alternativas acima sejam verdadeiras
    }
}