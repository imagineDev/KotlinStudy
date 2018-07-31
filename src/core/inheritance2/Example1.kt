package core.inheritance2

fun main(args: Array<String>) {

    Child1()
    println("====================")
    Child2(2)

}

open class Parent1 {

    init {
        println("Parent1 init")
    }

}

class Child1 : Parent1() { //Child1 have no primary constructor and no secondary constructor hence calling super constructor here as our only option

    init {
        println("Child1 init")
    }

}


open class Parent2 {
    init {
        println("Parent2 init")
    }
}

class Child2 : Parent2 { //Child1 have no primary constructor but has secondary constructor. Now its secondary constructors responsibility to call super constructor.

    init {
        println("Child2 init")
    }

    constructor(id: Int) { //By default :super()  --  If super had parameterised constructor we would have stated it here super(...)
        println("Child2 constructor")
    }

}

