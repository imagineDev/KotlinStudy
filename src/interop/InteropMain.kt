package interop

fun main(args: Array<String>) {

    val java = JavaClass()
    val kotlin = KotlinClass()

    println("My Name is ${java.className} and ${java.otherClassName} is my sister class")
    println("My Name is ${kotlin.getClassName()} and ${kotlin.getOtherClassName()} is my sister class")

}