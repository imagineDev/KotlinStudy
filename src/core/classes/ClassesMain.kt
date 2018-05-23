package core.classes

fun main(args: Array<String>) {


//=======================  BASIC CLASS 1 ================================

    //In kotlin we do not use 'new' keyword to create an object
    val basicClassObj: BasicClass1 = BasicClass1()

    //basicClassObj.mPrivateVariable  --  Compile time error : Cannot access private variable

    //To get value of private variable we have to create its getters/ setters
    println("Private value = ${basicClassObj.getPrivateValue()}")

    /* In kotlin there is no 'default' modifier
     * by default 'public' is the default modifier is nothing else is specified.
     * */
    basicClassObj.mDefaultVariable = 1
    basicClassObj.mPublicVariable = 2

    println("Default (public) value = ${basicClassObj.mDefaultVariable}")
    println("Public value = ${basicClassObj.mPublicVariable}")

    /*
     *To access a protected variable we have to first open a class
     * using keyword 'open'
     * */
    //basicClassObj.mProtectedVariable = 3  -- Compile time error : Access is protected in BasicClass1


    //=======================  PLAYER ================================


    val paul: Player = Player()
    paul.playerName = "Paul"
    paul.playerActive = true
    paul.playerMaxLife = 8


    val jin: Player = Player()
    jin.playerName = "Jin"


    //As we have implemented toString method of Player class
    println(paul)
    println(jin)


    //=======================  CLASS WITH CONSTRUCTOR 1 ================================

    val obj1 = ClassWithConstructor1("John Sean", 15, 200)
    println("Student details are ${obj1.getDetails()} and total marks are ${obj1.result}%")


    //=======================  LIST  ================================

    val sword = Weapon(WeaponType.HAND, "Sword", 10)
    val pistol = Weapon(WeaponType.GUN, "Pistol", 15)
    val grenade = Weapon(WeaponType.THROW, "Grenade", 30)

    val inventory: ArrayList<Weapon> = ArrayList()
    inventory.add(sword)
    inventory.add(pistol)
    inventory.add(grenade)

    //Print all the items in an inventory
    //println(inventory.toString())  -- Can also do, but make sure to override toString method of Weapon class

    for (weapon in inventory) {
        println(weapon.getDetails())
    }
    
    
    //==================== CLASS COMPARISON ===============================



    var simple1 = SimpleTestClass(10, "ABC")
    var simple2 = SimpleTestClass(10, "ABC")
    
    if(simple1 == simple2)
    {
        println("simple1 == simple2  is  true")
    }
    else
    {
        println("simple1 == simple2  is  false")
    }
    
    if(simple1.equals(simple2))
    {
        println("simple1.equals(simple2)  is  true")
    }
    else
    {
        println("simple1.equals(simple2)  is  false")
    }


    println("simple1.toString = "+simple1.toString())




    var data1 = DataTestClass(20, "XYZ")
    var data2 = DataTestClass(20, "XYZ")

    if(data1 == data2)
    {
        println("data1 == data2  is  true")
    }
    else
    {
        println("data1 == data2  is  false")
    }

    if(data1.equals(data2))
    {
        println("data1.equals(data2)  is  true")
    }
    else
    {
        println("data1.equals(data2)  is  false")
    }

    println("data1.toString = "+data1.toString())


}