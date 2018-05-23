package core.classes

class Weapon(val weaponType: WeaponType, val weaponName: String, val damageInflicted: Int) {

    fun getDetails() = "$weaponName, a ${weaponType.name} weapon with damage points = $damageInflicted"

    override fun toString() = getDetails()

}