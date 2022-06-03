package dio.me.santander

fun main(args: Array<String>) {
    val nTestes = readLine()!!.toInt()
    var i = 0

    while (i <   nTestes   ){
        var cont = 0
        while (cont == 0) {
            var raios = readLine()
            var raiosArray: List<String> = raios!!.split(" ")
            var r1 =  raiosArray[0].toInt()
            var r2 =  raiosArray[1].toInt()
            var R=r1+r2
            println(   R   )
            cont++
        }
        i++
    }
}