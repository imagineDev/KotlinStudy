package core.classes


/*
In data class
The compiler automatically derives the following members from all properties declared in the primary constructor:

 > equals()/hashCode() pair;
 > toString() of the form "User(name=John, age=42)";
 > componentN() functions corresponding to the properties in their order of declaration;
 > copy() function.

*/
data class DataTestClass(val id: Int, val name: String) {

}