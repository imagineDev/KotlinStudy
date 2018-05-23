package core.inheritance

open class FlyingBird(birdName: String, birdColor: String, private val flyingAltitude: Double) : Bird(birdName, birdColor) {

    fun getFlyingAltitude(): Double{
        return flyingAltitude
    }

}