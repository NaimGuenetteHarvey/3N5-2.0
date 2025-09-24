package org.example

fun main() {
var nombre: Int? = null
    while (nombre == null)
    {
        print("Veuillez entrer un nombre")
        nombre = readln().toIntOrNull()
        if (nombre == null)
        {
            print("Veuillez entrer nombre")
        }
        println("Merci")
    }

}