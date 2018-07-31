package core.basics

import java.util.function.Predicate

fun main(args: Array<String>) {

    val age = 20

    //An expression which evaluates to an Boolean value
    val isLegalAge: Boolean = age >= 18


    /*
    We are not initialising the variable and depending on a condition block to assign a value
    So we are providing a 'else' block as a default fallback, it none matches
     */
    val message: String
    var statusCode = 1

    if (statusCode == 1) {
        message = "Its an A"
    } else if (statusCode == 2) {
        message = "Its an B"
    } else {
        message = "None of them"
    }

    /*Note: If message not initialised either during initialisation or in else statement
     then It will give compile time error - message must be initialised
     */
    println(message)


//====== IF as an EXPRESSION=============

    /*
    *  'if' can also be used as an expression
    *   it can also be considered as replacement of ternary operator
    *
    *   NOTE: braces only used if body is multiline.
    *
    *   NOTE: 'if' used as an expression its mandatory to provide else
    *
    *   NOTE: statement will return 'Any' is return type in variable not specified
    *
    *   NOTE: 'if' if used as an expression we DO NOT use return keyword.
    *   return will trigger return of the enclosing function
    *
    *   In this case, the last statement in the block will be returned as if's expression
    *
    * */


    val qualifier = 2
    val test: String = if (qualifier == 2) {
        "A is printed"
        "B is printed"
        "C is printed"
    } else if (qualifier == 1) {
        "D is printed"
    } else {
        "E is printed"
    }

    println("if as an expression returns = $test")


//============= WHEN EXPRESSION ==============================
/*
 * when matches its argument against all branches sequentially until some branch condition is satisfied.
 * when can be used either as an expression or as a statement.
 * If it is used as an expression, the value of the satisfied branch becomes the value of the overall expression.
 * If it is used as a statement, the values of individual branches are ignored. (Just like with if, each branch can be a block, and its value is the value of the last expression in the block.)
 */

/*In Kotlin there is no switch statement.
  switch is replaced by when statement

  writing the above code using when...
  */

    val message2: String
    when (statusCode) {

    //No use of break

        1 -> message2 = "Its an A"
        2 -> message2 = "Its an B"

    //The else branch is evaluated if none of the other branch conditions are satisfied.
        else -> { //we can also use block for multiline
            message2 = "None of them"
        }
    }


    //Using when as an expression

    val message3: String
    message3 = when (statusCode) {

    //No use of return statement
        1 -> "Its an A"
        2 -> "Its an B"

    //The else branch is evaluated if none of the other branch conditions are satisfied.

    /*IMPORTANT - If when is used as an expression, the else branch is mandatory,
     *unless the compiler can prove that all possible cases are covered with branch conditions
     *(as, for example, with enum class entries and sealed class subtypes).
     * */
        else -> "None of them"

    }


    //More with 'when'
    val validNumbers = arrayListOf<Int>(50, 60, 70, 80)
    var x = 10

    when (x) {
        0, 1 -> println("x == 0 or x == 1")
        in 10..20 -> println("x is in the range of 10 - 20 (all inclusive)")
        in validNumbers -> println("x is present in a list containing valid numbers")
        !in 21..30 -> println("x is NOT present in range of 21 - 30 (all inclusive)")
    //x.isEven() -> print("x is even")  -- Can even do something like this
        else -> println("otherwise")
    }


    //Another possibility is to check that a value 'is' or '!is' of a particular type
    fun hasPrefix(x: Any) = when (x) {
        is String -> x.startsWith("prefix") //due to smart cast
        is Int -> x.toString() //Not returning any thing, just a test condition
        is Double -> x.toString()
        else -> false
    }


    //when can also be used in case of 'if'
    //Is is preferred ??
    when {
        x == 0 -> println("x is zero")
        x == 1 -> println("x is one")
        x == 10 -> println("x is ten")
    }


    //======================================================


    //Conditions are even predefined in Collections
    val numbers: ArrayList<Int> = ArrayList()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    numbers.add(4)
    numbers.add(5)

    numbers.removeIf(Predicate { it % 2 == 0 })

    println(numbers)


    //Using streams
    val students = arrayListOf<String>("Sahil", "Shashank", "Deepak", "Danny", "Lisa", "Maria")
    print(students.filter { it.startsWith("S") })

}