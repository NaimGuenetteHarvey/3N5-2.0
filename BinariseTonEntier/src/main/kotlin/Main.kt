package org.example


fun main(args: Array<String>)

{
    val valeur = args[0].toInt()
    val changement = Integer.toBinaryString(valeur)
    println(changement)
}