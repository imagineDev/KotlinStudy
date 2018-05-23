package core.classes

class Player {

    var playerName: String = "n/a"
    var playerMaxLife: Int = 5
    var playerActive: Boolean = true

    override fun toString(): String {
        return """ Player Info:
            Player Name : $playerName
            Player Max Life : $playerMaxLife
            Player isActive : $playerActive
            """
    }

}