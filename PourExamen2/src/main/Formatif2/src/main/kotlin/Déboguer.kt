package org.example

fun main() {
    val tabTest = arrayOf(10, 20, 30)
    val tabResultat = moyenneCumulative(tabTest)
    afficheTableau(tabResultat)
}

fun moyenneCumulative(tab: Array<Int>): Array<Int> {
    val resultat = Array(tab.size) { 0 }
    for (i in tab.indices) {
        var somme = 0
        for (j in 0..i) {
            somme += tab[j]
        }
        resultat[i] = somme / (i + 1)
    }
    return resultat
}

fun afficheTableau(tab: Array<Int>) {
    for (valeur in tab) {
        println(valeur)
    }
}