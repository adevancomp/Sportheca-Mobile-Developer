package dio.me.introducao;

import java.util.Scanner;

public class MultiplicacaoSimples {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int a = leitor.nextInt();
        int b = leitor.nextInt();
        int x = a+b;
        System.out.println("X = "+x);
    }
}
