package org.example

fun main() {
    val nombres = listOf(3, 8, 12, 5, 7, 18, 2)
    val pairs = nombres.filter { it % 2 == 0 }
    println(pairs) // [8, 12, 18, 2]
}
fun nombreMinOuMax() {
    val nombres = listOf(45, 12, 78, 3, 99, 24)
    println("Min = ${nombres.minOrNull()}") // 3
    println("Max = ${nombres.maxOrNull()}") // 99
}
//À partir de la liste ["chat", "chien", "oiseau"], crée une nouvelle liste où chaque mot est écrit en majuscules.
fun Animaux() {
    val animaux = listOf("chat", "chien", "oiseau")
    val majuscules = animaux.map { it.uppercase() }
    println(majuscules) // [CHAT, CHIEN, OISEAU]
}
fun Fruits() {
    val fruits = listOf("pomme", "banane", "pomme", "orange", "banane", "pomme")
    val nbPommes = fruits.count { it == "pomme" }
    println("Nombre de pommes = $nbPommes") // 3
}
fun multiplierPar2() {
    val nombres = listOf(1, 2, 3, 4, 5)
    val doubles = nombres.map { it * 2 }
    println(doubles) // [2, 4, 6, 8, 10]
}
fun retirerNombreNegatif() {
    val nombres = listOf(5, -3, 8, -1, 10)
    val positifs = nombres.filter { it >= 0 }
    println(positifs) // [5, 8, 10]
}
fun trierLesDoublons() {
    val nombres = listOf(1, 2, 2, 3, 4, 4, 5)
    val doublons = nombres.groupBy { it }
        .filter { it.value.size > 1 }
        .keys
    println(doublons) // [2, 4]
}