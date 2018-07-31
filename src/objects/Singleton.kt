package objects


/**
 * OLD SCHOOL SINGLETON
 *
 * NOTE:
 * > private constructor is used to ensure this class can’t be initialized anywhere except inside of this class.
 * > init will be called when this class is initialized the first time i.e. when Singleton.instance called the very first.
 * > Holder object & lazy instance is used to ensure only one instance of Singleton is created.
 *
 * ABOUT LAZY:
 * > the first call to get() executes the lambda passed to lazy() and remembers the result, subsequent calls to get() simply return the remembered result.
 * > By default, the evaluation of lazy properties is synchronized: the value is computed only in one thread,
 *   and all threads will see the same value.
 * */
class Singleton private constructor() {

    var myTestVariable: Int = 10

    init {
        println("This ($this) is a singleton")
    }

    private object Holder {
        val INSTANCE = Singleton()
    }

    companion object {
        val instance: Singleton by lazy { Holder.INSTANCE }
    }

}


fun main(args: Array<String>) {

    println(Singleton.instance.myTestVariable++)
    println(Singleton.instance.myTestVariable++)
    println(Singleton.instance.myTestVariable++)
    println(Singleton.instance.myTestVariable++)
    println(Singleton.instance.myTestVariable++)

}