package objects

import java.util.function.Consumer


fun main(args: Array<String>) {


}


data class Book(val bookId: Int, val bookName: String)

object BookShelf {

    val books = ArrayList<Book>()

    fun showAll() {

        books.forEach(Consumer { println(it) })

    }

}


class Demo {

    val abc: Int = 100

    fun printAbc() {
        println("ABC = " + abc)
    }

    companion object {
        var counter = 0

        fun printCounter() {
            println("Counter = $counter")
        }

    }


}