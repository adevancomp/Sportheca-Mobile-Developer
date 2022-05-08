package exercicio

const val TEXTO_MENU = "Seja bem vindo a calculadora de Adevan Neves!\n0 -> Adição        1 -> Subtração \n2 -> Multiplicação 3 -> Divisão\n4 -> Porcentagem\n"
const val ADC = 0
const val SUBT = 1
const val MULT = 2
const val DIV = 3
const val PORCT = 4

fun main(){
    var sim=true
    var esc_string:String?
    var operando:Float
    while(sim){
        println(TEXTO_MENU)
        print("Sua escolha: ")
        esc_string= readlnOrNull()
        if(esc_string.isNullOrBlank()){
            println("Desculpe, você precisa digitar um valor válido! Encerrando o programa :(")
            break
        }

        var esc=esc_string.toInt()

        print("a: ")
        esc_string= readlnOrNull()
        if(esc_string.isNullOrBlank()){
            println("Desculpe, você precisa digitar um valor válido! Encerrando o programa :(")
            break
        }
        var a = esc_string.toFloat()

        print("b: ")
        esc_string= readlnOrNull()
        if(esc_string.isNullOrBlank()){
            println("Desculpe, você precisa digitar um valor válido! Encerrando o programa :(")
            break
        }
        var b = esc_string.toFloat()

        //Neste momento os valores estão todos corretos, agora podemos aplicar as operações

        when{
            esc.equals(ADC) -> {
                operacao(a,b){a,b->a+b}
            }
            esc.equals(SUBT) -> {
                operacao(a,b){a,b->a-b}
            }
            esc.equals(MULT) -> {
                operacao(a,b){a,b->a*b}
            }
            esc.equals(DIV) -> {
                operacao(a,b){a,b->a/b}
            }
            esc.equals(PORCT) -> {
                operacao(a,b){a,b-> b*100/a }
            }
            esc> PORCT || esc < ADC -> {
                println("Sua escolha foi inválida !")
            }
        }

        print("Seja continuar ?(s/n) ")
        var escolha = readlnOrNull();
        if(escolha.isNullOrBlank()){
            println("Finalizando ....")
            break
        }

        if(escolha in "sS"){
            sim=true
        } else {
            println("Finalizando ....")
            sim=false
        }

    }
}

fun operacao(a:Float,b:Float,op:(Float,Float)->Float){
    val resultado=op(a,b)
    println("Resultado : $resultado")
}
