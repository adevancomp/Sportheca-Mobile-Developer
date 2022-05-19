package dio.me.bank

data class Pessoa(var nome: String,var cpf: String) {
    fun pessoaInfo() = "$nome - $cpf"
}