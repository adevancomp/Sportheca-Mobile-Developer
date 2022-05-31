package dio.me.ordft;

import java.util.*;

public class OrdenacaoNumerosParesImpares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);
        List<Integer> listpares = new ArrayList<>();
        List<Integer> listimpares = new ArrayList<>();

        int n = sc.nextInt();

        for (int i = 0; i < n; i++)
        {
            int valor = sc.nextInt();
            if (valor % 2 == 0 ) listpares.add(valor);
            else listimpares.add(valor);
        }

        listpares.stream().sorted().forEach(System.out:: println);
        listimpares.stream().sorted(Comparator.reverseOrder()).forEach(System.out:: println);

        sc.close();
    }
}
