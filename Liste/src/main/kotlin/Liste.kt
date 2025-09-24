package org.example

fun main() {
    val nombres = listOf(5, 10, 15, 20, 25)
    val somme = nombres.sum()
    val moyenne = nombres.average()
    println("Somme = $somme")       // 75
    println("Moyenne = $moyenne")   // 15.0
}