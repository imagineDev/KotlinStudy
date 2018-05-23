package core.basics

fun main(args: Array<String>) {


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

