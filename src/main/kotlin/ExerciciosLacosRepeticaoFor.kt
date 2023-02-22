/*
5 Escreva um programa capaz de receber um número inteiro N e imprimir uma escada de tamanho N usando
o caracter #.
Se a entrada do programa for 3, teremos:
#
##
###
Se a entrada do programa for 5, teremos:
#
##
###
####
#####*/
fun imprimaNumeros1a50(){
    for (i in 1..50)
        print("$i ")
}
fun imprimaNumeros1a50Decrescente(){
    for (i in 50 downTo 1)
        print("$i ")
}
fun imprimaNumeros1a50IgnorarMultiplos5(){
    for (i in 1..50) {
        if (i % 5 == 0) {
            continue
        }
        print("$i ")
    }
}
fun somaNumerosNumIntervalo(vFinal: Int){
    var valor:Int = 0
    for (i in 1..vFinal){
        valor += i
    }
    print("A soma dos valor iniciando de 1 até $vFinal é   $valor")

}
fun exibeEscala(n: Int) {
    for (i in 1 ..  n){
        for (j in 1 .. i) {
            print("#")
        }
        println()
    }
}
fun main() {
//    1 -
//    imprimaNumeros1a50()
//    2 -
//    imprimaNumeros1a50Decrescente()
//    3 -
//    imprimaNumeros1a50IgnorarMultiplos5()
//    4 -
//    somaNumerosNumIntervalo(500)
//    5 -
    exibeEscala(10)// Não é a implementação ideal, mas funciona




}