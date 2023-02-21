/**
 * Type    Bit
 * Double  64
 * Float   32
 * Long    64
 * Int     32
 * Short   16
 * Byte    8
 * Boolean ?
 * String  ?
 * Char    ?
 * */


fun main() {

    var c: Char = 'a'
    var s: String = "kjsdhfkjhsadkfhjsdkfjhskdfjhskdfjhskdujfh"
    var b: Boolean = true

    var double: Double = 10.0// Para forçar um valor a ser Double tem que por . algum numero
    var float: Float = 10f// Para forçar um valor a ser float tem que colocar o f
    var long: Long = 10L// Para forçar um valor a ser Long tem que por L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10



    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

}