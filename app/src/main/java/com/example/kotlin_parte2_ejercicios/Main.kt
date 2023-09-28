package com.example.kotlin_parte2_ejercicios

fun main() {

    val serVivoX = SerVivo(3)
    val serVivoY = SerVivo(5)
    val humano1 = Humano("Homero", 34)
    val humano2 = Humano("Bart", 9)



    val mayorSerVivo = serVivoX.mayor(serVivoY)
    val mayorHumano = humano1.mayor(humano2)



    println("Mayor SerVivo: $mayorSerVivo")
    println("Mayor Humano: $mayorHumano")



    println("Iguales: ${serVivoX == serVivoY}")
    println("Iguales: ${humano1 == humano2}")

}