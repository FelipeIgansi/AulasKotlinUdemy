fun main() {
    for (i in 1..10)  print("$i ")
    println()
    val str = "Estou amando Kotlin"
    for (char in str) print("$char")
    println()
    for (i in 0..20 step 2) print("$i ")
    println()

    for (j in 20 downTo 0 step 3) print("$j ")
}