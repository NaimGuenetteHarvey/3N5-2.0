package org.example
import org.jsoup.Jsoup

fun main() {
    //Créer un programme lisant la page web suivante : https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html
    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"
    val doc = Jsoup.connect(url).get()
    println(doc)

    //Extraire l'ensemble des adresses courriels incluses dans une balise <a>.
    println(doc.select("a"))

    //Afficher dans la console les informations sous la forme "Prénom nom a pour courriel prenom.nom@cegepmontpetit.ca" pour chaque élément trouvé
    for (lien in doc.select("a[href^=mailto:]")) {
        val adresse = lien.attr("href").removePrefix("mailto:")
        val (prenom, nom) = adresse.substringBefore("@").split(".")
        println("${prenom.replaceFirstChar { it.uppercase() }} ${nom.replaceFirstChar { it.uppercase() }} a pour courriel $adresse")
    }
    //doc.select("a[href^=mailto:]") → prend seulement les <a> qui contiennent un courriel.
    //
    //removePrefix("mailto:") → enlève le mailto:.
    //
    //split(".") → sépare prénom et nom.
    //
    //replaceFirstChar { it.uppercase() } → met la première lettre en majuscule.
}