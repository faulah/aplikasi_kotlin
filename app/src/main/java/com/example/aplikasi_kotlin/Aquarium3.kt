package com.example.aplikasi_kotlin

class Aquarium3(length: Int = 100, width: Int = 20, height: Int = 40, numberOfFish: Int) {
    // Dimensions in cm
    var length: Int = length
    var width: Int = width
    var height: Int = height

    val volume: Int
        get() = width * height * length / 1000  // 1000 cm^3 = 1 liter


    init {
        // 1 liter = 1000 cm^3
        println("Volume: ${width * length * height / 1000} liters")
        // 2,000 cm^3 per fish + extra room so water doesn't spill
        val tank = numberOfFish * 2000 * 1.1
        // calculate the height needed
        this.height = (tank / (length * width)).toInt()
    }

    fun printSize() {
        println("Width: $width cm, Length: $length cm, Height: $height cm")
    }
}

fun main() {
    val aquarium6 = Aquarium3(numberOfFish = 29)
    aquarium6.printSize()
}

























