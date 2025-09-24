package org.example
import org.jsoup.Jsoup

fun main() {
    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"
    val doc = Jsoup.connect(url).get()
    println(doc)
    println(doc.select("a"))

    //afficher le texte a l'interieur des balises
    for (lien in doc.select("a")) {
        println(lien.text() + " a pour courriel " + lien.attr("href"))

    }

    fun Extrairelestitres()
{ val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/pagesAvecTitre.html"
 val doc  = Jsoup.connect(url).get()
 println(doc.select("h1"))

}

    fun LienHypertextes()
    {
        val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"
        val doc = Jsoup.connect(url).get()
        for (lien in doc.select("a"))
        {
            val href = lien.attr("href")
            if (href.startsWith("https://"))
            {
                println(href)
            }
        }

    }


//    fun TableHTML()
//    {
//        val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"
//        val doc = Jsoup.connect(url).get()
//        val extraire = doc.select("tr")
//        for (lien in extraire)
//        {
//            println(lien.select("td").map { it.text() }
//                if (extraire.isNotEmpty())
//                {
////                   Afficher la ligne séparée par |
//                    println(extraire.joinToString(" | "))
//                }
//
//
//        }
//    }


//
    //Mots Clés dans un paragraphe
//    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/paragraphe.html"
//    val doc = Jsoup.connect(url).get()
//
//    // Extraire le texte du paragraphe
//    val texte = doc.select("p").text()
//    println("Texte extrait : $texte")
//
//    // Compter combien de fois "programmation" apparaît
//    val mot = "programmation"
//    val compteur = Regex("\\b$mot\\b", RegexOption.IGNORE_CASE).findAll(texte).count()
//
//    println("Le mot $mot apparaît $compteur fois.")

    //couriel avec REGEX
//    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansTexte.html"
//    val texte = URL(url).readText()
//
//    // Regex pour détecter les adresses courriel
//    val regex = Regex("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z]{2,}")
//    val courriels = regex.findAll(texte).map { it.value }.toList()
//
//    println("Courriels trouvés :")
//    for (mail in courriels) {
//        println(mail)
//    }
// IMAGES
//    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/images.html"
//    val doc = Jsoup.connect(url).get()
//
//    // Extraire toutes les balises <img>
//    val images = doc.select("img")
//
//    for (img in images) {
//        val src = img.attr("src")   // ex: "https://site.com/images/chat.png"
//        val nomFichier = src.substringAfterLast("/") // garde juste "chat.png"
//        println("Image trouvée : $nomFichier")
//    }

}




