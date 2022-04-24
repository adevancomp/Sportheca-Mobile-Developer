package dio.me.exercicios;

import java.util.Scanner;

public class AcimaDaDiagonalSecundaria {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double soma = 0;
        int i;
        int j;
        char O = leitor.next().toUpperCase().charAt(0);
        String op = String.valueOf(O);
        double[][] M = new double[12][12];
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                M[i][j] = leitor.nextDouble();
            }
        }
        //Somatório dos elementos da diagonal secundária
        //Diagonal Secundária : os elementos em que i+j=n+1, constituem a diagonal secundária.
        for (i = 0; i < 12; i++) {
            for (j = 0; j < 12; j++) {
                if(i+j<11){
                    soma+=M[i][j];
                }
            }
        }
        if(op.equals("M")){
            soma /= ((M.length * M.length) - 12) / 2;
        }
        System.out.println(String.format("%.1f", soma));
    }
}
