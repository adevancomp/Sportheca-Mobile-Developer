package dio.me.bank
fun main(args: Array<String>) {
    val p1 =Pessoa("Adevan Neves Santos","12221919")
    println(p1.pessoaInfo())
    println("Program arguments: ${args.joinToString()}")
}