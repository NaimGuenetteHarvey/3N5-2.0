```kotlin 
fun main() {
val a : Int = addition(4 + 5, 100)
val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) )
}
fun addition(a: Int, y: Int): Int {
return a + y
}
fun multiplication(x: Int, b: Int): Int {
return x * b
}
  ```
On aura la trace suivante :

        | ligne exécutée                                                              | effet    | pile d'appels |
        |-----------------|-----------------------------------|---|
        | val a : Int = addition(4 + 5, 100)                                          |  a= 109  | main          |
        | val b : Int = multiplication( multiplication(4, a), multiplication(2, 3) )  |  b= 2616 | main          |
        | return a + y                                                                |  a+y     | main          |
        |return x * b                                                                 |x * b     | main