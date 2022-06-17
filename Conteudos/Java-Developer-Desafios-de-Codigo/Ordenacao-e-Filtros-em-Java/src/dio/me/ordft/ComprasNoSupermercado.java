package dio.me.ordft;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.TreeSet;
import java.util.Arrays;

public class ComprasNoSupermercado {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        List<String> items = new ArrayList<>(); //itens duplicados em lista
        String entrada = leitor.nextLine();      //linhas a serem lidas
        int linhas = Math.min(Integer.parseInt(entrada), 100);
        for(int i = 0; i < linhas; i++) {
            entrada = leitor.nextLine();
            items.add(String.join(" ", new TreeSet<>(Arrays.asList(entrada.split(" ")))));
        }
        items.forEach(System.out::println);
    }
}
