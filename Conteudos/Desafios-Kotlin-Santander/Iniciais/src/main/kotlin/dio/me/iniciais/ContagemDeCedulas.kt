package dio.me.iniciais

import java.util.Scanner

fun main() {
    val notas: IntArray = intArrayOf(100, 50, 20, 10, 5, 2, 1)
    var contador = false
    var valor = readLine()!!.toInt()

    println(valor)

    for (i in 0..(notas.size - 1)) {
        if (valor >= notas[i]) {
            println("${valor/notas[i]} nota(s) de R$ ${notas[i]},00")
            // TODO Calcular a quantidade de notas e imprimir o resultado esperado...
        } else {
            println("0 nota(s) de R$ ${notas[i]},00")
            // TODO Imprimir o resultado esperado, considerando zero como
        }
        valor = valor % notas[i]
    }
}