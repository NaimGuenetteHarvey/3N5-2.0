package org.example


fun repete(n:Int, nombreFois:Int) : List<Int>
{
  val liste =   mutableListOf<Int>()
   for (i in 1..n)
   {
     for ( j in 1..nombreFois)
     {
       liste.add(i)
     }
   }
    return liste
}
fun main()
{
  println(repete(3,4))
}