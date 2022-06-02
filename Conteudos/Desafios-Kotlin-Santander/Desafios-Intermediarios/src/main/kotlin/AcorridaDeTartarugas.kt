// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main(args: Array<String>) {

    for(i in 1..3) {
        val l = readLine()!!.toInt()
        val v = readLine()!!.split(" ")

        var maior = 0
        for (a in 0..l-1){
            if (v[a].toInt() >  maior   ) maior = v[a].toInt()
        }

        if(   maior  < 10   ) println("1")
        else if (    maior <20   ) println("2")
        else println("3")
    }
}