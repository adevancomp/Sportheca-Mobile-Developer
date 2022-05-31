package dio.me.aritmetica;

import java.util.Scanner;

public class ExibindoNumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int cont=2;
        while(cont<=N){
            System.out.println(cont);
            cont+=2;
        }
    }
}
