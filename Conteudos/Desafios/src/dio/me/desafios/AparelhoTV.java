package dio.me.desafios;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class AparelhoTV {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int V = leitor.nextInt();
        int T = leitor.nextInt();
        List<Integer> valores = new LinkedList<>();
        for(int i=0;i<T;i++){
            valores.add(leitor.nextInt());
        }
        for(int i=0;i<T;i++){
            if((V+valores.get(i))<=0){
                V=0;
            } else if(V+ valores.get(i)>=100){
                V=100;
            } else {
                V+= valores.get(i);
            }
        }
        System.out.println(V);
    }
}
