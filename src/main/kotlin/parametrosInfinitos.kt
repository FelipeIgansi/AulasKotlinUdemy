fun main() {
    println( media(1f, 10f, "", false, 2))
    arrayOf(2,"", 3)
}
// Da para inclusive ter mais Generics declaradas
fun <T> media(vararg notas: T):Float{
// Generics serve para basicamente passar qualquer tipo de valor sem expecificar tem que ser uma letra em Maiusculo
//    declarada tanto no inicio quanto no fim
    var total = 0f
    for (n in notas) {
        if (n is Float) total += n
    }
    return total/notas.size
}