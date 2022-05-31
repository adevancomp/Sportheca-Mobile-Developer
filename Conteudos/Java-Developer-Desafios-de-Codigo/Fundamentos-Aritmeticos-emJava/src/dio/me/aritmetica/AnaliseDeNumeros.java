package dio.me.aritmetica;

import java.io.IOException;
import java.util.Scanner;

public class AnaliseDeNumeros {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int[] numeros={0,0,0,0,0};
        numeros[0]=leitor.nextInt();
        numeros[1]=leitor.nextInt();
        numeros[2]=leitor.nextInt();
        numeros[3]=leitor.nextInt();
        numeros[4]=leitor.nextInt();

        int qtdPares=0;
        int qtdImpares=0;
        int qtdPositivos=0;
        int qtdNegativos=0;

        for(int i=0;i<5;i++){
            if(numeros[i]%2==0){
                qtdPares++;
            }
            if (numeros[i]%2!=0){
                qtdImpares++;
            }
            if (numeros[i]>0){
                qtdPositivos++;
            } if(numeros[i]<0){
                qtdNegativos++;
            }
        }

        System.out.println(qtdPares + " par(es)");
        System.out.println(qtdImpares + " impar(es)");
        System.out.println(qtdPositivos + " positivo(s)");
        System.out.println(qtdNegativos + " negativo(s)");
    }

}
