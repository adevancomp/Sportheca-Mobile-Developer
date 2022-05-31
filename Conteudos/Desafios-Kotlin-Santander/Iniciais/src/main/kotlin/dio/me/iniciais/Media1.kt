package dio.me.iniciais

import java.util.Scanner

fun main() {
    val rd = Scanner(System.`in`)
    val A = rd.nextDouble()
    val B = rd.nextDouble()
    var media=0.0
    media=(A*3.5 + B*7.5 ) / 11.0
    println("MEDIA = %.5f".format(media))
}