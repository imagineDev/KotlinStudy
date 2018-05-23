package core.inheritance

open class NonFlyingBird(birdName: String, birdColor: String, private val canRun: Boolean) : Bird(birdName, birdColor) {


    fun canRun(): Boolean {
        return canRun
    }


}