package core.basics

fun main(args: Array<String>) {

    //Kotlin is Null safe. We cannot assign null to a variable unless be explicitly make it runnable
    //by specifying '?'
    val a: String? = null //Its a string wrapped in a container

    //val a1 : String = null  --  Compile time error

    println("Value of a is $a")

    //also - it prints string 'null'
    println(null)

    //No exception - it prints the class name kotlin.Unit
    println(nothingToReturn())


    //print(a.length) -- Not allowed as a can be null, need to handle


    //Checks if a if null or not. If not null print null ; else return null
    println((if (a != null) a.length else null))


    //The above statement can be simplified as this.
    /*
     * This is known as Safe calls
     * Operator '?.' executes the next call if the expression is NOT eq to null
     * else returns null
     *
     * Its useful in case of chains:
     * bob?.department?.head?.name
     *
     **/
    println(a?.length)



    //Nullable list
    val nullableList: List<Int?> = listOf(1, 2, null, 4)



    /*
    * What if we want to use DEFAULT value
    * we use elvis operator '?:'
    *
    * if left hand side of '?:' is null only then the right hand side will be executed
    * */

    println(a?.length ?: "a is null")


    /*
    * the not-null assertion operator (!!) converts any value to a non-null type
    * and throws an exception if the value is null.
    * ie. forced un boxing. You are on your own after this.
    * */

    try {
        println(a!!.length)
    } catch (e: NullPointerException) {
        println("Null pointer exception")
    }


    //============= SAFE CASTING ===================

    /*
    * Regular casts may result into a ClassCastException if the object is not of the target type.
    * Another option is to use safe casts that return null if the attempt was not successful.
    * */

    //returns a if a is not null else null is returned
    val aInt: Int? = a as? Int

    //'as' is used for type casting

    val k: Any = 100
    val kString = (k as Int).toString()
    println(kString)
}


fun nothingToReturn() {

}
