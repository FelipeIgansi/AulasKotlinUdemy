/*
1 Escreva uma função que seja capaz de converter uma quantidade de anos em meses, dias , horas, minutos e segundos.
Saida desejada:
2 anos
24 meses
730 dias
...
*/
fun main() {
    convertAnos(2)
}

fun convertAnos(anos: Int) {
    println("$anos anos equivalem a: ")
    println("${anos * 12} meses")
    println("${anos * 365} dias")
    println("${anos * 365 * 24} horas")
    println("${anos * 365 * 24 * 60} minutos")
    println("${anos * 365 * 24 * 60 * 60} segundos")
}
//4 Escreva uma função que calcule a quantidade de milhas e converte em KM (1 Milha = 1,6 KM)
fun converteMiParaKM(mi:Int):Float{
    return mi * 1.6f
}