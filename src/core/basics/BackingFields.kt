package core.basics


/*
* A Backing Field is just a field that will be generated
* for a property in a class only if it uses the
* default implementation of at least one of the accessors.
*
* */
class BackingFields {

}

class MyData {


    var abc: Int = 5 //Cannot ignore the value else it will be abstract

    var xyz: Int = 0
        get() = 5       //Assigning default getter - No backing field generated


    var cde: String = ""                        //no backing field generated
        get() = "{$abc $xyz}"


    /* var a: String = ""
         get() = field
         set(value) = { field = value }*/


}