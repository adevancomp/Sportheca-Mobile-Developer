package dio.me.introducao;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;


public class FolhaDePagamento {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int valor1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int valor2 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double valor3 = Double.parseDouble(st.nextToken());

        System.out.println("NUMBER = "+valor1);
        System.out.println(String.format("SALARY = U$ %.2f", valor2*valor3));
    }
}