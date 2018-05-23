package core.inheritance

open class Bird(private val birdName: String, private val birdColor: String) {

    fun getBirdName(): String{
         return birdName
    }

    fun getBirdColor(): String{
        return birdColor
    }

}