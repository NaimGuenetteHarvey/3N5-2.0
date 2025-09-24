package org.example
import org.jsoup.Jsoup

fun main()
{
    val adresse = "marie.tremblay@cegepmontpetit.ca"

    // Partie avant le @
    val partieNom = adresse.substringBefore("@")

    // Découper en prénom et nom
    val (prenom, nom) = partieNom.split(".")

    // Mettre la première lettre en majuscule
    val prenomFormat = prenom.replaceFirstChar { it.uppercase() }
    val nomFormat = nom.replaceFirstChar { it.uppercase() }

    // Affichage
    println("$prenomFormat $nomFormat a pour courriel $adresse")
}
