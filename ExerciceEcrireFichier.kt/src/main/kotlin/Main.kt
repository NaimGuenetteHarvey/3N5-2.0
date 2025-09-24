package org.example

import java.io.File


fun main() {
 val nomFichier = "Fichier.txt"
    val contenu = "Guenette Naim"
    val Fichier = File(nomFichier)
    Fichier.writeText(contenu)
}