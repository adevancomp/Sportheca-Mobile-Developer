package dio.me.bank.zonadeteste

import dio.me.bank.Banco

fun main(){
    val dioBank = Banco("Digital Innovation One Bank",13)
    println(dioBank.nome)
    println(dioBank.numero)

    val dioBank2 = dioBank.copy("DIO 2",90)
    println(dioBank2.info())

    println("O dioBank ainda é imutável: ${dioBank2.info()}")
}