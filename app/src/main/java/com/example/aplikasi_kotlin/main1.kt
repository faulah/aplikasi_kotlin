package com.example.aplikasi_kotlin

fun buildAquarium() {
    val aquarium6 = Aquarium3(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
}

fun main() {
    buildAquarium()
}
