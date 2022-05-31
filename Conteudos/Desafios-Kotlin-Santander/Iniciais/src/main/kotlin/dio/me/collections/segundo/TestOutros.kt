package dio.me.collections.segundo

fun main(){
    val joao= Funcionario("Joao",2000.0)
    val maria= Funcionario("Maria",1500.0)
    val adevan= Funcionario("Adevan",5034.0)

    val funcionarios = listOf(adevan,joao,maria)

    funcionarios.forEach { println(it) }
    println("Ache a Maria: "+funcionarios.find { it.nome == "Maria" })
    funcionarios.sortedBy { it.salario }.forEach { println(it) }      //ordenador por salário meus objetos funcionários
}

data class Funcionario(
    val nome:String,
    val salario:Double
) {
    override fun toString(): String {
        return "Nome: $nome\nSalário: $salario "
    }
}