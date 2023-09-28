package com.example.kotlin_parte2_ejercicios

class Humano(val nombre: String, edad: Byte) : SerVivo(edad) {

    override fun mayor(otro: SerVivo): SerVivo {
        if (otro is Humano) {
            if (edad > otro.edad) {
                return this
            } else if (edad == otro.edad) {
                return if (nombre.length >= otro.nombre.length) this else otro
            }
        }
        return super.mayor(otro)
    }



    override fun toString(): String {
        return "Nombre: $nombre, Edad: $edad"
    }



    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Humano

        if (!super.equals(other)) return false
        if (nombre != other.nombre) return false

        return true
    }
}