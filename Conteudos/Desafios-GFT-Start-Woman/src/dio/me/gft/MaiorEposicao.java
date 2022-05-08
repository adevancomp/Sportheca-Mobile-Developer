package dio.me.gft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaiorEposicao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Integer> numeros = new ArrayList<>();
        for(int i = 0; i < 100; i++){
            int numero = scan.nextInt();
            numeros.add(numero);
        }

        Integer max = Collections.max(numeros);
        System.out.println( max );
        int position = numeros.indexOf(max) +1;
        System.out.println(position);
    }
}
