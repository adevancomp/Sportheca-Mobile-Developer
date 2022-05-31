package dio.me.aritmetica;

import java.util.Scanner;

public class ContagemDeCedulas{

    public static void main(String[] args){
        int dinheiro,copiaValor,notas100,notas50,notas20,notas10,notas5,notas2,notas1;
        Scanner sc = new Scanner(System.in);
        dinheiro = sc.nextInt();
        copiaValor = dinheiro;
        notas100=copiaValor/100;
        copiaValor=copiaValor-notas100*100;

        notas50=copiaValor/50;
        copiaValor=copiaValor-notas50*50;

        notas20=copiaValor/20;
        copiaValor-=(notas20*20);

        notas10=copiaValor/10;
        copiaValor-=(notas10*10);

        notas5=copiaValor/5;
        copiaValor-=(notas5*5);

        notas2=copiaValor/2;
        copiaValor-=(notas2*2);

        if(copiaValor==1){
            notas1=1;
        } else {
            notas1=0;
        }

        System.out.println(dinheiro);
        System.out.println(notas100+" nota(s) de R$ 100,00");
        System.out.println(notas50+" nota(s) de R$ 50,00");
        System.out.println(notas20+" nota(s) de R$ 20,00");
        System.out.println(notas10+" nota(s) de R$ 10,00");
        System.out.println(notas5+" nota(s) de R$ 5,00");
        System.out.println(notas2+" nota(s) de R$ 2,00");
        System.out.println(notas1+" nota(s) de R$ 1,00");

    }

}