package core.basics

fun main(args: Array<String>) {

    val numbers: ArrayList<Int> = ArrayList()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)


    /*
       for(i = 0 ; i<10 ; i++)
       This for loop is not present in Kotlin
       Kotlin has what we use to call for-each loop
     */


    //for loop
    for(i: Int in numbers)
    {
        println(i)
    }

    //or simply (as type can be inferred)
    for (i in numbers) {
        println(i)
    }


    println("====================")

    //for loop runs from 1 to 10
    //NOTE: start ie. 1 and end ie. 10 are included
    for (i in 1..10) {
        println(i)
    }

    println("====================")

    //for loop runs from 1 to 9
    //NOTE: start ie. 1 is included and end ie. 10 is excluded
    for (i in 1 until 10) {
        println(i)
    }



    println("====================")

    //IMPORTANT - for loop does not run as its empty
    //if values are decrementing we have to use 'downTo' keyword for that
    for (i in 10..1) {
        println(i)
    }



    println("=========DOWN TO===========")

    //for loop runs from 10 to 1
    //NOTE: start ie. 1 and end ie. 10 are included
    for (i in 10 downTo 1) {
        println(i)
    }


    println("=========DOWN TO with STEP===========")

    /* for loop runs from 10 to 1
     * NOTE: start ie. 1 and end ie. 10 are included
     * step means interval by default its 1
     * so o/p will be in interval of 2
     * 10, 8, 6, 4, 2
     */
    for (i in 10 downTo 1 step 2) {
        println(i)
    }

    println("=========WHILE===========")

    //While Loop
    var a: Int = 1
    while (a <= 10) {
        println(a)
        a++
    }

    println("=========DO WHILE===========")

    var b: Int = 1
    do {
        println(b)
        b++
    } while (b <= 10)


    println("=========TRAVERSING MAP===========")

    val map = mapOf<String, Int>("Sahil" to 100, "Shashank" to 98, "Deepak" to 40, "Lita" to 65)

    for( (k,v) in map )
    {
        println("$k scored $v marks")
    }


}