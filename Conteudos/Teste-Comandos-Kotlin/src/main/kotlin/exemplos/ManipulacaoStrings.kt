package exemplos

import java.util.*

fun main(){
    val welcome = "Bem vinda(o)"
    val name = "luisa"
    // o variavel.capitalize() está deprecionado, agora é a utilizar este conjunto de instruções
    println("$welcome, ${name.replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }}!")
}