package org.example
import java.io.File


fun main(args: Array<String>)
{
  if (args.isEmpty())
  {
      println("Veuillez entrer des arguments")
  }
    for (fichier in args)
    {
        val file  = File(fichier)
        if (file.exists())
        {
            println(file.readText()+"----")

        }
    }

}