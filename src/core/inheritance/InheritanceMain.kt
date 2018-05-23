package core.inheritance

fun main(arg: Array<String>){

    val senu = Eagle(2000.0)
    println("""
        Bird = ${senu.getBirdName()}
        Color = ${senu.getBirdColor()}
        Flying Altitude = ${senu.getFlyingAltitude()}
    """.trimMargin())

    println("==================================================")

    val pingu = Penguin(true)
    println("""
        Bird = ${pingu.getBirdName()}
        Color = ${pingu.getBirdColor()}
        Can Run = ${pingu.canRun()}
    """.trimMargin())

}