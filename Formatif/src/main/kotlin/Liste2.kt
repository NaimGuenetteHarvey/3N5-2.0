package org.example

fun main ()
{
    val notes = listOf(10,200,-12,46)
    val notes1 = listOf(1.2,3.4,1.2,5.5,6.3,2.4)
    val liste = listOf("a","b","c","d","e","f","g","h","i")
    val mots = listOf("allo","bonjour","orange","macaroni")
    val somme = listOf(1,4,6,8,10)
    //pour le dernier numero
    val liste3 = listOf("chat", "chien", "rat", "éléphant")
    val resultat = motsCourtsMajuscules(liste3, 4)
    println("Liste de départ : $liste3")
    println("Résultat : $resultat")

    println(notesValides(notes))
    println(pairsJusqua(10))
    println(moyenneNotes(notes1))
    println(inverserListe(liste))
    println(maximumListe(notes))
    println(longueurMots(mots))
    println(filtrerCourts(mots,4))
    println(doublesTriees(notes1))
    println(sommeCumulative(somme))

}
 fun pairsJusqua(n: Int): List<Int>
 {
     val liste = listOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20)
     if (n < 0)
     {
         throw IllegalArgumentException("n must be greater than 0")
     }
     return liste.filter { it % 2 == 0 }
 }

fun notesValides(notes: List<Int>): List<Int>
{
 return (notes.filter { it in 0..100 })

}
fun moyenneNotes(notes: List<Double>): Double
{
    if (notes.isEmpty())
    {

        throw IllegalArgumentException("notes can't be empty")
    }
    return notes.average()

}
fun inverserListe (liste: List<String>): List<String>
{
 return liste.reversed()

}
fun maximumListe (liste: List<Int>): Int
{
    if (liste.isEmpty())
    {
        throw IllegalArgumentException("liste can't be empty")
    }
    return liste.max()

}
fun longueurMots(mots: List<String>): List<Int>
{
    return mots.map { it.length }

}
fun filtrerCourts(mots: List<String>, n: Int): List<String>
{
    return mots.filter { it.length <= n }

}
fun doublesTriees(liste: List<Double>): List<Double>
{
    return liste.distinct().sorted()

}
fun sommeCumulative(tab: List<Int>): List<Int>
{
    val resultat = mutableListOf<Int>()
    var somme = 0
    for (valeur in tab) {
        somme += valeur
        resultat.add(somme)
    }
    return resultat
}
fun motsCourtsMajuscules(mots: List<String>, n: Int): List<String>
{
    return mots
        .filter { it.length <= n }   // garder seulement les mots courts
        .map { it.uppercase() }      // transformer en majuscules
}