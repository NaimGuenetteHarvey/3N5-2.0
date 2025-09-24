package org.example

fun main() {
    // Int -> Float
    val entier: Int = 42
    val enFloat: Float = entier.toFloat()
    println("Int -> Float : $entier devient $enFloat")

    // Double -> Int
    val reel: Double = 42.99
    val enInt: Int = reel.toInt()
    println("Double -> Int : $reel devient $enInt (la partie après la virgule est supprimée)")

    // String -> Int
    val chaineValide: String = "123"
    val enIntValide: Int = chaineValide.toInt()
    println("String -> Int : \"$chaineValide\" devient $enIntValide")

    val chaineInvalide: String = "123abc"
    try {
        val enIntInvalide: Int = chaineInvalide.toInt()
        println("String -> Int : \"$chaineInvalide\" devient $enIntInvalide")
    } catch (e: NumberFormatException) {
        println("String -> Int : \"$chaineInvalide\" provoque une erreur (NumberFormatException)")
    }

    // Int -> String
    val enString: String = entier.toString()
    println("Int -> String : $entier devient \"$enString\"")

    // Float -> Double
    val flottant: Float = 3.14f
    val enDouble: Double = flottant.toDouble()
    println("Float -> Double : $flottant devient $enDouble")

    // Double -> String
    val doubleEnString: String = reel.toString()
    println("Double -> String : $reel devient \"$doubleEnString\"")

    // String -> Double
    val chaineDouble = "99.99"
    val enDouble2 = chaineDouble.toDouble()
    println("String -> Double : \"$chaineDouble\" devient $enDouble2")
}