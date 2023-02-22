fun main() {
//    var s: String = null// Não funciona,pois a string não vai aceitar null
    var s: String? = null// Para poder usar um valor nulo tenho que por o ?

//    print(s.length) //Não vai  funcionar, pois estou tentando acessar um valor nulo
    print(s?.length) //Para isso tenho que usar o ?
    print(s!!.length) //Outra opção é usar !! para assumir e tratar o erro dessa forma a execução é interrompida
    // Evitar usar, mas basicamente eu usando isso estou dizendo deixando explicito que eu tenho certeza que o valor não será null
    // Acho melhor usar o ? e tratar se for nulo

}