package exemplos

fun main(){
    val grade = (0..10).random()
    println(grade.getStudentStatus())
    var t:Int
    var x:Int? = 40
    var w:Int? = null
    t= x ?: w ?: -1
    print(t)
}

private fun Int.getStudentStatus(): String {
    println("nota $this")
    return when(this){
        in 0..4 -> "Reprovado"
        in 5..7 -> "Mediano"
        in 8..9 -> "Bom"
        10 -> "Bom"
        else -> "Indefinido"
    }
}
