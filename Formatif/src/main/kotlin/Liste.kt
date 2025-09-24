package org.example

fun main()
{
    // Tests pour joursParMois
    println("joursParMois(1)  = ${jourParMois(1)}")   // [31]
    println("joursParMois(7)  = ${jourParMois(7)}")   // [31, 28, 31, 30, 31, 30, 31]
    println("joursParMois(12) = ${jourParMois(12)}")  // liste complète

    // Test pour tri
    val liste = listOf(5.5, 9.0, 2.1, 1.2)
    println("tri([5.5, 9, 2.1, 1.2]) = ${trie(liste)}") // [1.2, 2.1, 5.5, 9.0]

    // Test d’exception
    try {
        println(jourParMois(13))
    } catch (e: Exception) {
        println("Erreur : ${e.message}")
    }

}
fun jourParMois (n: Int ): List<Int>
{
 val jours = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
    if (n < 1 || n > 12)
    {
        throw IllegalArgumentException("n doit être entre 1 et 12")

    }

    return jours.take(n)
}
fun trie (liste: List<Double>) : List<Double>
{
  return liste.sorted()
}

//val liste = listOf(1, 2, 3)
//val listeMutable = mutableListOf(1, 2, 3)
//liste.take(3)     // prend les 3 premiers
//liste.takeLast(2) // prend les 2 derniers
//liste[0] // premier élément
//liste.sorted() // croissant
//liste.sortedDescending() // decroissant
//liste.reversed() // inverser
//liste.distinct() // enelve les doublons
//liste.map { it * 2 } // double chaque valeur
//mots.map { it.uppercase() } // majuscule
//liste.filter { it % 2 == 0 } // pairs uniquement
//liste.size // nombre total
//liste.count { it > 10 } // nombre qui respecte une condition
//liste.sum()
//liste.average()
//liste.minOrNull()
//liste.maxOrNull()
//for (x in liste) { // parcourir
//    println(x)
//}
//if (liste.isEmpty()) println("Vide") // verifier si vide
//if (n > 12) throw IllegalArgumentException("Trop grand") // lancer une exception

//🔹 1. Les bases à toujours garder en tête
//
//En Kotlin, tu as deux grands types de listes :
//
//listOf(...) → liste immuable (tu ne peux pas modifier son contenu).
//
//mutableListOf(...) → liste modifiable (ajouter, enlever, remplacer des éléments).
//
//🔹 2. Quand tu vois un exercice avec une liste
//
//Toujours te poser ces questions dans l’ordre :
//


//🟢 Étape 1 : Quelle est la liste de départ ?
//
//Est-ce que l’énoncé te donne déjà une liste (listOf(...)) ?
//
//Ou est-ce que tu dois la créer toi-même (comme joursParMois) ?
//
//👉 Ici dans ton numéro : tu dois créer une liste des jours par mois. Donc première étape : définir la liste de référence :
//
//val jours = listOf(31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
//


//🟢 Étape 2 : Est-ce que je garde toute la liste ou juste une partie ?
//
//Parfois on demande de prendre seulement les n premiers éléments → pense à .take(n)
//
//Parfois on demande de filtrer selon une condition → pense à .filter { ... }
//
//Parfois on demande de parcourir pour calculer quelque chose → pense à une boucle for ou .map.
//
//👉 Dans ton numéro, on prend jusqu’à n mois → donc .take(n) est parfait.
//


//🟢 Étape 3 : Est-ce que je dois transformer la liste ?
//
//Si tu dois trier → .sorted() (ordre croissant) ou .sortedDescending().
//
//Si tu dois appliquer un calcul sur chaque élément → .map { it * 2 } ou autre.
//
//Si tu dois compter → .count { condition }.
//
//👉 Dans ton numéro tri, on veut trier → donc .sorted() suffit.
//


//🟢 Étape 4 : Et si la valeur est invalide ?
//
//Beaucoup d’exercices testent aussi ta capacité à gérer les cas limites :
//
//Si la liste est vide → souvent il faut lancer une exception.
//
//Si n > 12 ou n < 1 → tu lances une exception.
//
//👉 Dans ton numéro, on doit lancer une exception si n > 12.
//
//🔹 3. Façon de penser (méthode générale)
//
//Quand tu lis un énoncé avec des listes, entraîne-toi à penser dans cet ordre :
//
//Quelle est la liste ? (est-ce qu’on me la donne ou je dois la créer ?)
//
//Quelle partie de la liste je prends ? (tout, une portion, un filtre)
//
//Est-ce que je dois transformer les éléments ? (tri, calcul, uppercase, etc.)
//
//Est-ce qu’il faut gérer des cas limites ? (vide, n trop grand, mauvaise donnée)
//
//🔹 4. Application à d’autres exercices
//
//Compter les éléments pairs dans une liste :
//
//Liste donnée ? → oui → listOf(...).
//
//Partie à prendre ? → non, toute la liste.
//
//Transformation ? → pas besoin, mais un filtre + count.
//
//Cas limite ? → si liste vide → 0.
//
//Solution : liste.count { it % 2 == 0 }
//
//Mettre en majuscule les prénoms :
//
//Liste donnée de prénoms.
//
//Partie ? → non.
//
//Transformation ? → oui → .map { it.uppercase() }
//
//Cas limite ? → si vide → retourne vide.
//
//Somme cumulative :
//
//Liste donnée de points.
//
//Partie ? → toute la liste.
//
//Transformation ? → oui → parcourir et accumuler.
//
//Cas limite ? → si vide → liste vide.