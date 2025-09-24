package org.example

fun main(args : Array<String>) {
    val str = args[0]
    val num = str.toIntOrNull()

    if (num != null)
    {
        println(num.toString(2))
    }
    else {"Erreur"}

}