package org.example

fun moisImpairs(n: Int): List<String> {
    val mois = listOf(
        "Janvier", "Février", "Mars", "Avril",
        "Mai", "Juin", "Juillet", "Août",
        "Septembre", "Octobre", "Novembre", "Décembre"
    )
    if (n > 12 || n < 1) throw IllegalArgumentException("n doit être entre 1 et 12")
    return mois.take(n).filterIndexed { index, _ -> (index + 1) % 2 != 0 }
}

fun trierDesc(liste: List<Int>): List<Int> {
    return liste.sortedDescending()
}

fun main() {
    println(moisImpairs(5))   // [Janvier, Mars, Mai]
    println(trierDesc(listOf(7, 2, 10, 3))) // [10, 7, 3, 2]

    try {
        println(moisImpairs(15)) // exception
    } catch (e: Exception) {
        println("Erreur : ${e.message}")
    }
}