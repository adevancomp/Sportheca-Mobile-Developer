package dio.me.bank

data class Pessoa(open var nome: String,open var cpf: String) {
    fun pessoaInfo() = "$nome - $cpf"
}