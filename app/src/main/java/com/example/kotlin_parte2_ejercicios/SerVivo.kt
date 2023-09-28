package com.example.kotlin_parte2_ejercicios

open class SerVivo(val edad: Byte) {

    open fun mayor(otro: SerVivo): SerVivo {
        return if (edad > otro.edad) this else otro
    }

    override fun toString(): String {
        return "Edad: $edad"
    }


    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as SerVivo

        if (edad != other.edad) return false

        return true
    }


}