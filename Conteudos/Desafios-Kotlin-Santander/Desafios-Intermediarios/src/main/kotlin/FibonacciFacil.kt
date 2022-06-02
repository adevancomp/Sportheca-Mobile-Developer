fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    when{
        n==1->{print("0 ")}
        n==2->{print("0 1 ")}
        n>=3->{
            print("0 ")
            escreveFibonacci(n)
        }
    }
}

fun escreveFibonacci(n: Int) {
    var a=0
    var b=1
    var sum=a+b
    val ni=n-1
    var cont=0
    while(cont<ni){
        print("$sum ")
        sum=a+b
        a=b
        b=sum
        cont++
    }
}