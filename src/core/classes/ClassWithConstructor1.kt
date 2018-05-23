package core.classes


/*
*  NOTE:
*  We have defined a constructor along with class name
*  In Kotlin we can assign a instance variable along with constructor definition
*
*  As a class constructor will invoke the value passed would be auto initialised to these variables and
*  hence we do not have to manually assign as we did in java.
*
*  ie. studentName, studentAge are global instances and can be used through out the class
*
*  However studentTotalScore is local variable, as its not declared as a variable
*  it can only be used with instance variables declaration or with constructor
*  and is not in the global scope.
*
*
* */
class ClassWithConstructor1(val studentName: String, var studentAge: Int, studentTotalScore: Int) {

    val result: Double = (studentTotalScore / 5).toDouble()

    fun printDetails() {

        println(studentName)
        println(studentAge)
        //println(studentTotalScore)  --  Compile time error : Unresolved reference

    }


    /*
    As simple as that :)
     A single expression can simple be returned using assignment operator
     Type can be auto inferred
     */
    fun getDetails() =
            "$studentName, $studentAge years old"


}