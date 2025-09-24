package org.example
import org.jsoup.Jsoup
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
  //https://info.cegepmontpetit.ca/3N5-Prog3/testbot/nomsEtCourriels.html
    //Extraire les noms dans <p> et les courriels dans <a>, puis afficher :

        val url = "https://info.cegepmontpetit.ca/3N5-Prog3/testbot/nomsEtCourriels.html"
        val doc = Jsoup.connect(url).get()

        val noms = doc.select("p")           // tous les noms dans <p>
        val mails = doc.select("a")          // tous les courriels dans <a>

        for (i in noms.indices) {
            println("${noms[i].text()} → ${mails[i].text()}")
        }

}