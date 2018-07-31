package core.basics

fun main(args: Array<String>) {


    val b: Byte = 8
    val s: Short = 128
    val i: Int = 32000
    val l: Long = 32000000 //Use 'L' postfix type to make it long without need for declaring type.
    val f: Float = 3.14f //By default it considers double. Hence we have to specify float type 'f' or 'F'
    val d: Double = 77.12345678

    val bool: Boolean = true
    val str: String = "Hi"
    val char: Char = 'C'

    //Mostly Every number type supports conversions:
    val mLongValue: Long = 1_000_000
    val mShort = mLongValue.toShort()
    val mInt = mLongValue.toInt()

    println("Long was = $mLongValue\nIts equivalent :\nshort = $mShort\nInt = $mInt")


    //We can use underscores to make then more readable

    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xFF_EC_DE_5E
    val bytes = 0b11010010_01101001_10010100_10010010

    println("One Million = $oneMillion")


}


/*
 *functions are defined by 'fun' keyword
 *return type is separated by ':', if none specified then kotlin.Unit is returned.
 *Javas void is replaced by kotlin.Unit ; Unit return type can be omitted
 * return keyword is compulsory if the function returns something other than Unit.
 */
fun myFunction(a: Int, b: String, c: Boolean) : String{
    return "Hello"
}


//SPECIAL CASE
//ONLY IN THIS CASE THE TYPE CAN BE INFERRED
//Function with an expression body and inferred return type:
fun sum(a: Int, b: Int) = a+b


//Using 'if' as an expression ; Replacement of ternary operator
fun maxOf(a: Int, b: Int) = if (a > b) a else b

