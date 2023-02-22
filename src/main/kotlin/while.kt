fun main() {
    var opcao:String? = ""
    while (opcao != "5"){
        println("1- Criar personagem")
        println("2- Atribuir Status")
        println("3- Batalhar")
        println("4- Quem é o vencedor?")
        println("5- Sair")
        opcao = readLine()
        clear()
    }
/*    var v:Int = 0
    while (v< 100){
        if (v == 50){
            continue // O Continue ignora tudo que está abaixo. E ele joga o fluxo para o inicio e valida de novo
            v++// nunca seria executado por conta do continue
        }
        v++
    }*/
}
fun clear(){
    println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n")
}