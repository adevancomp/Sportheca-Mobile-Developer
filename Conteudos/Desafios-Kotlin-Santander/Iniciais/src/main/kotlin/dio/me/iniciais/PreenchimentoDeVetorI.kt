package dio.me.iniciais

fun main() {
    val N = readLine()!!.toInt()
    val vetor = IntArray(10)
    vetor[0]=N
    var cont=1

    while(cont<=9){
        vetor[cont]=vetor[cont-1]*2
        cont++
    }

    for(index in vetor.indices){
        println("N[$index] = ${vetor[index]}")
    }
}