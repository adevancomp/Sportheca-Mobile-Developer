package dio.me.bank

import java.math.BigDecimal
import dio.me.bank.Pessoa as Pessoa1

class Funcionario(
        var nome:String,
        var cpf:String,
        val salario:BigDecimal
) : Pessoa1(nome = nome, cpf = cpf) {

}