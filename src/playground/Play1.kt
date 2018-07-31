package playground

fun main(args: Array<String>) {

    showMessage(object : OnItemClickListener {
        override fun onItemClicked(id: Int) {
            TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
        }
    })

    val x: String? = null

    if (x is String) {
        print(x.length)
    }


}

fun showMessage(cb: OnItemClickListener?) {

    println(if (cb != null) "Button Clicked" else "No click callback")

}


interface OnItemClickListener {
    public fun onItemClicked(id: Int)
}
