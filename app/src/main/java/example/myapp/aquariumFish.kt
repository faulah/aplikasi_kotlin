package example.myapp

import com.example.aplikasi_kotlin.Aquarium3

class aquariumFish  (open var length: Int = 100, open var width: Int = 20, open var height: Int = 40) {
    open var volume: Int
        get() = width * height * length / 1000
        set(value) {
            height = (value * 1000) / (width * length)
        }
    open val shape = "rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    fun printSize() {
        println(shape)
        println(
            "Width: $width cm " +
                    "Length: $length cm " +
                    "Height: $height cm "
        )
        // 1 l = 1000 cm^3
        println("Volume: $volume liters Water: $water liters (${water / volume * 100.0}% full)")
    }
}
fun main() {
    val aquarium6 = Aquarium3(numberOfFish = 29)
    aquarium6.printSize()
}







