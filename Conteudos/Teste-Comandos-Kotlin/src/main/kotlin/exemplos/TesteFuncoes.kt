package exemplos

fun main(){
    val x:Int
    val z:Int
    //z=calculate(34,90,::sum)
    //z=calculate(34,90){a,b -> a*b}
    z=calculate(34,90){a,b ->
        println("Vou calcular $a * $b!")
        //A última instrução precisa ser o
        // meu retorno, porém posso adicionar qualquer
        // coisa no meio
        a*b}
    print(z)
}

fun sum(a1:Int,a2:Int) = a1.plus(a2)

fun calculate(n1: Int, n2: Int, operation: (Int, Int) -> Int): Int {
    return operation(n1, n2)
}