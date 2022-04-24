package dio.me.exercicios;

import java.util.Scanner;

public class TempoDoDobby {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt() + leitor.nextInt();
        if ((A)>N)
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }
}
