package org.example

fun main(args: Array<String>) {
    var tabTest:Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8)
    var tabResultat = sommeCumulative(tabTest)

    afficheTableau(tabResultat)
}

fun sommeCumulative(tabEntiers: Array<Int>):Array<Int> {
    val resultat = mutableListOf<Int>()
    var somme = 0
    for (valeur in tabEntiers) {
        somme += valeur
        resultat.add(somme)
    }
    return resultat.toTypedArray()
}

fun afficheTableau(tabEntiers: Array<Int>){
    for(i in 0 .. tabEntiers.size-1) {
        println(tabEntiers[i])
    }
}