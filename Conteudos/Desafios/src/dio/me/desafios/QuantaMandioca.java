package dio.me.desafios;

import java.util.Scanner;

public class QuantaMandioca {
    public static final int[] porcoes = { 300, 1500, 600, 1000, 150 };
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int totalMandioca = 225;
        for(int i=0;i<5;i++){
            totalMandioca+=porcoes[i]*(leitor.nextInt());
        }
        System.out.println(totalMandioca);
    }
}
