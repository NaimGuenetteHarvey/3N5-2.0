package org.example

import kotlin.random.Random

fun creeTableauAleatoire(n: Int): Array<Int>

{
    return Array(n) {Random.nextInt(0, 100)}
}
fun Calcul (tab : Array<Int>)
{
    val sum = tab.sum()
    val min = tab.min()
    val max = tab.max()
    println("$sum, $min, $max")

}
fun main ()
{
    val tab = creeTableauAleatoire(10)
    Calcul(tab)
}