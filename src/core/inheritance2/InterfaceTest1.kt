package core.inheritance2

fun main(args: Array<String>) {

}


class InterfaceTest1 : MyInterface {


    override fun bar() {

    }

    override val prop: Int = 5


}

/*
*  In an interface everything is by default 'open'
*
*  An interface can contains
*  1. Declarations of abstract methods
*  2. as well as Method implementations
*
*
*  NOTE:
*  They can have properties but these need to be abstract or to provide accessor implementations.
*
* */
interface MyInterface {

    val prop: Int // abstract by default

    val propertyWithImplementation: String  //NOT abstract as it provides an implementation ; Optional to override
        get() = "foo"

    /*
        var propertyWithBackingField: String  --  var can be used in an interface
        get() = "foo"
        set(value) { field = "bar" }  --- Property in an interface cannot have a backing field
     */

    fun bar() //abstract by default

    fun foo() {  //optional to override, NOT abstract as we have specified the body
        print(prop)
    }

}

interface One {
    fun doWork()
}

interface Two {
    fun doWork()
}