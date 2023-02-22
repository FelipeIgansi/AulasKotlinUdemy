fun main() {
      println(saudacao(true))
}


fun saudacao(dia:Boolean) = if (dia) "Bom dia" else "Boa Noite" // É bizarro, mas funciona
fun saudacao2(dia:Boolean): String {
    return if (dia) "Bom dia"
            else "Boa Noite"}  // É bizarro, mas funciona