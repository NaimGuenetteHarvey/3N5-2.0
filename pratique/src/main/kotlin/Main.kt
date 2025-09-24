package org.example

import org.jsoup.Jsoup
fun main()
{
    val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/courrielsDansA.html"
    val doc = Jsoup.connect(url).get()
    println(doc.select("a"))
    val adresse = doc.attr("href").removePrefix("mailto:")
    val (prenom, nom) = adresse.substringBefore("@").split(".")
    println(adresse)
}