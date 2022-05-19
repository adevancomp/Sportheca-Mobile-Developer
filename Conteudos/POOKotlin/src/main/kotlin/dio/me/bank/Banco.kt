package dio.me.bank

data class Banco(
        val nome:String,
        val numero:Int
) {
    fun info () = "nome: $nome numero: $numero"
}
