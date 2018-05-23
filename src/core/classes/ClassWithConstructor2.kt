package core.classes

/*
* Secondary Constructors
* */
class ClassWithConstructor2(name: String) {

    /*
    * If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
    * either directly or indirectly through another secondary constructor(s).
    * Delegation to another constructor of the same class is done using the this keyword:
    *
    * If no primary constructor then need not to pass anything
    *
    * */
    constructor(num: Int): this("default"){

        //variables defined

    }

}