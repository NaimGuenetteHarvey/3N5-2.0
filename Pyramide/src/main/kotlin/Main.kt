package org.example

fun affichePyramide(hauteur: Int)
{
    var nbEtoiles: Int = 1
    var nbEspace: Int = hauteur - 1
    var ligne: String

    for ( i: Int in 1..hauteur)
    {
        ligne = " ".repeat(nbEspace) + "*".repeat(nbEtoiles)
        nbEtoiles+=2
        nbEspace -= 1
        println(ligne)

    }

}
fun main (args:Array<String>)
{
    for (arg in args)
    {
      val hauteur = arg.toIntOrNull()
        if (hauteur != null && hauteur >0)
        {
            affichePyramide(hauteur)
            println()
        }



    }

}