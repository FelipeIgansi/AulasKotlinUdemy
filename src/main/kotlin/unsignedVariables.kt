fun main() {
    //unsigned se aplica a todos os tipos acima
    var uByte: UByte = 10u //Para valores que não podem ser negativos
    var uInt: UInt = 10u //Para valores que não podem ser negativos
    var uLong: ULong = 10u //Para valores que não podem ser negativos

    println("\n\n-------    Unsigned        --------\n\n")

    println("Long MAX ${ULong.MAX_VALUE} - MIN ${ULong.MIN_VALUE}")
    println("Int MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")
    println("Short MAX ${UShort.MAX_VALUE} - MIN ${UShort.MIN_VALUE}")
    println("Byte MAX ${UByte.MAX_VALUE} - MIN ${UByte.MIN_VALUE}")


}