package dio.me.collections.terceiro

fun main(){
    println("--- Collections mutáveis ---")
    val fcs = mutableListOf<String>()
    fcs.add("Adevan")
    fcs.add("Geonavi")
    fcs.forEach { println(it) }
    println("Tirou Geovani")
    fcs.remove("Geonavi")
    fcs.forEach { println(it) }
}