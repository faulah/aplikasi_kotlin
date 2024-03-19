package example.myapp


open class Aquarium(open var height: Int, open var width: Int, open var length: Int) {
    open lateinit var volume: Int
    open lateinit var water: Double
    open val shape: String = "cylinder"

    init {
        volume = (width / 2 * length / 2 * height / 1000 * PI).toInt()
        water = volume * 0.8
    }

    open fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters " +
                "Water: $water liters " +
                "Shape: $shape ")
    }
}

class TowerTank(override var height: Int, diameter: Int) : Aquarium(height, diameter, diameter) {
    init {
        // Initialize diameter for TowerTank
        width = diameter
        length = diameter
    }

    override lateinit var volume: Int
    override lateinit var water: Double
    override val shape: String = "cylinder"

    override fun printSize() {
        println("Width: $width cm " +
                "Length: $length cm " +
                "Height: $height cm ")
        println("Volume: $volume liters " +
                "Water: $water liters " +
                "Shape: $shape ")
    }
}

