package dio.me.desafios;

import java.io.IOException;
import java.util.Scanner;

public class ImprevistosNatalinos  {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int numAlunos = leitor.nextInt();
        int numPc = leitor.nextInt();
        int qtsPcsQuebrados = leitor.nextInt();
        int qtsPcsSemComp = leitor.nextInt();
        if (numAlunos<=(numPc-1-qtsPcsQuebrados-qtsPcsSemComp)) {
            System.out.println("Igor feliz!");
        } else {
            int metade = qtsPcsSemComp / 2;
            if (qtsPcsQuebrados>metade)
                System.out.println("Caio, a culpa eh sua!");
            else
                System.out.println("Igor bolado!");
        }
    }
}
