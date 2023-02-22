/*1 Considere uma caixa d’água de 2 mil litros. Rômulo gostaria de encher a caixa d’água com balões de água de
7 litros. Quantos balões cabem na caixa d’água sem que o volume seja excedido?

2 FizzBuzz. Imprima os números de 1 a 50 em ordem crescente de acordo com a regra abaixo:
a. Quando um número for divisível por 3, imprimir Buzz.
b. Quando um número for divisível por 5, imprimir Fizz.
c. Quando um número for divisível por 3 e 5, imprimir FizzBuzz.

3 Escreva um programa capaz de receber um texto e imprimi-lo invertido.
Entrada: Meu nome é Julius. Saída: .suiluJ é emon ueM

4 Escreva uma função que recebe uma string, verifica se existe a mesma quantidade de caracteres ‘x’ e ‘o’ e
retorna true ou false. Caso não exista nem ‘x’ nem ‘o’, retornar false.
“xxooox” -> true “xxxxo” -> false “bdefghjij” -> false “ooooxzzzzz” -> false*/


fun ex1() {
    val capCaixa = 2000
    val capaBalao = 7

    var numBaloes = 0
    while ((numBaloes * capaBalao) + capaBalao < capCaixa) {
        numBaloes++
    }
    println("Cabem $numBaloes na caixa d' agua")
}
fun ex2(){
    var i = 1
    while (i <= 50){

        if ((i % 3 == 0) && (i % 5 == 0)) print("FizzBuzz ")
        else if (i % 3 == 0) print("Buzz ")
        else if (i % 5 == 0) print("Fizz ")
        else print("$i  ")
        i++
    }
}

fun ex3(name:String){
    for (i in name.length-1 downTo 0 )
        print("${name[i].lowercase()}")    //Minha versão
/*    var i = name.length-1
    while (i >=0 ){
        print(name[i].lowercase())
        i--
    }*/
}
fun main() {
    ex3("Felipe Maciel Igansi")
}