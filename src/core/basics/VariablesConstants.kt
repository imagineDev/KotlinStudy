package core.basics

/*You CAN put a core.basics.main() fun inside a class, and make it a static method of JVM, by using the @JvmStatic annotation.
* The compiler will create a class and the free functions will be static methods of that class.*/
//Main function

fun main(args: Array<String>) {


    // =========== VARIABLES ============


    //variable (defined by var keyword)
    var a1: Int = 10

    //Type can be inferred automatically
    var a2 = 10

    //It is not mandatory for local variables to assign a value immediately, but in this case we have to specify a type
    var a3: Int

    //ERROR: - But before you access the variable make sure you first assign it a value
    //println(a3)  -- Compile time error : Variable a3 must be initialized

    a3 = 10
    println(a3)

    //var a3 -- Compile time error : Variables must have a type annotation or be initialised

    //string
    var a4 = "This is a string"

    //double
    var a5 = 5.0

    //a6 is inferred as double... as a5 was double
    var a6 = a5 / 3
    println(a6)

    /*
a5 was double but a7 was expecting an integer. Implicit type casting cannot be done from
a greater type like double to a lower type like string as it can cause data loss.
Hence we type cast it
*/
    var a7: Int = (a5 / 3).toInt()


    // =========== CONSTANTS ============


    //Rules same as Variables
    //constants or final variables are defined by val keyword
    val b1: Int = 20

    //Same as Variable - Local variables need not to be initialised immediately, but in this case we have to specify a type
    val b2: Int

    //ERROR: - But before you access the variable make sure you first assign it a value
    //println(b2)  --  Compile time error : Variable b2 must be initialized

    //Once a val is initialised, it cannot be reinitialised again
    // b1 = 30  --  Compile time error : Val cannot be reassigned


    // =========== CONCATENATION AND INTERPOLATION ============


    val num = 100
    val str = "Hello World"
    val score = 5.6

    //appending with string
    println("" + num + str + score)

    //integer + string is not a valid operation
    //println(num + str)  --  Compile time error

    //However we can write it like this.
    //String first means concatenation
    println(str + num)

    //The kotlin way,
    println("Number is $num, score is $score and I have to say $score")

    //Kotlin also supports triple quotes like Python
    //This will be printed exactly, with the end on lines in consideration
    println("""
                Number is $num,
                score is $score
                and I have to say $score
                """)

    println("Operations can be done as -> ${num * 2}")

    println("My salary is $$num")

    println("Method ref in string : ${getStringToPrint()}")

    println("Length of '${getStringToPrint()}' is ${getStringToPrint().length}")

    println("Length of '${getStringToPrint()}' is ${getStringLength(getStringToPrint())}")

    //Printing a function which does not return anything
    println("${nothing()}")

}


fun getStringToPrint() : String{
    return "This is the string to print"
}

fun getStringLength(str: String) : Int{
    return str.length
}

fun nothing(){

}
