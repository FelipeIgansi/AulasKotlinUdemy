fun main() {
    val salario = 10000f
    var investAna = 0f
    var investPaula = 0f
    var mes = 1


    do {
        investAna += (((salario * 0.05f) * 2) + (investAna * 0.002f))
        investPaula += ((salario * 0.05f) + (investPaula * 0.008)).toFloat()
        mes++

        println("Investimento Ana- $investAna ---------- Investimento Paula $investPaula")
    } while (investAna > investPaula)

    println("\nAna - $investAna --- Paula - $investPaula")
    println("Ao final de ${mes/12} Anos o investimento da Paula Superará o da Ana")
}