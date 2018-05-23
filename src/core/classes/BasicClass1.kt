package core.classes


/*
* class is by default public as public is the default visibility specifier, there is no 'default' keyword
* and a class if by default 'final', to make it non-final use 'open' keyword
* */
class BasicClass1 {

    private var mPrivateVariable: Int = 0

    var mDefaultVariable: Int = 0 //by default variables are public

    public var mPublicVariable: Int = 0 //by default variables are public

    protected var mProtectedVariable: Int = 0 //wont work until open class, as class are by default final public

    //No need to write public as by default its public
    public fun getPrivateValue(): Int {
        return mPrivateVariable
    }

}