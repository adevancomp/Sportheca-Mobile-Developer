package dio.me.bank.zonadeteste

import dio.me.bank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach { elemento ->
        println("${elemento.name} ${elemento.descricao}")
    }
    val pf = ClienteTipo.PF
    val pj = ClienteTipo.PF
    println("---------------------------------")
    println("${pf.name} ${pf.descricao}")
    println("---------------------------------")
    println("${pj.name} ${pj.descricao}")
}