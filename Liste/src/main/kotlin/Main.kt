package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Déclaration de la liste
    val liste: List<String> = listOf("zz", "aa", "zzz", "bb", "dd", "z", "zz", "cc")
    println(liste)

    // Taille de la liste et accès par index
    println("Taille de la liste : ${liste.size}")
    println("Élément à l’index 3 : ${liste[3]}")

    // Tri alphabétique
    val listeTriee: List<String> = liste.sorted()
    println("Tri alphabétique : $listeTriee")

    // Inverser la liste
    val listeInverse: List<String> = liste.reversed()
    println("Liste inversée : $listeInverse")

    // Tri par longueur des chaînes
    val listeTrieeLongueur: List<String> = liste.sortedWith(compareBy { it.length })
    println("Tri par longueur : $listeTrieeLongueur")

    // Tri par longueur PUIS alphabétique
    val listeTrieeLongueur2: List<String> = liste.sortedWith(compareBy({ it.length }, { it }))
    println("Tri par longueur puis alphabétique : $listeTrieeLongueur2")

    // Recherche dans la liste
    println("Contient 'zz' ? ${"zz" in liste}")
    println("Contient 'zzzz' ? ${"zzzz" in liste}")
    println("Contient 'zzzz' avec contains() ? ${liste.contains("zzzz")}")

    // Comptage des occurrences
    println("Nombre de 'z' : ${liste.count { it == "z" }}")
    println("Nombre de 'zz' : ${liste.count { it == "zz" }}")
    println("Nombre de 'zzz' : ${liste.count { it == "zzz" }}")
}