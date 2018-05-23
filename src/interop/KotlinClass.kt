package interop

class KotlinClass {

    fun getClassName(): String {
        return this::class.simpleName!!
    }

    fun getOtherClassName(): String{
        return JavaClass().className
    }

}