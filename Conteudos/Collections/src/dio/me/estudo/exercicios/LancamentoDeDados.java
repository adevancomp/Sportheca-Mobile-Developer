package dio.me.estudo.exercicios;

import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

public class LancamentoDeDados {
    public static void main(String[] args) {
        Random rd = new Random();
        Map<Integer,Integer> lancamentos = new TreeMap<>();
        lancamentos.put(1,0);
        lancamentos.put(2,0);
        lancamentos.put(3,0);
        lancamentos.put(4,0);
        lancamentos.put(5,0);
        lancamentos.put(6,0);
        int lado;
        for(int i=0;i<100;i++){
            lado = rd.nextInt(6)+1;
            switch (lado){
                case 1:
                    lancamentos.put(1, lancamentos.get(1)+1);
                    break;
                case 2:
                    lancamentos.put(2, lancamentos.get(2)+1);
                    break;
                case 3:
                    lancamentos.put(3, lancamentos.get(3)+1);
                    break;
                case 4:
                    lancamentos.put(4, lancamentos.get(4)+1);
                    break;
                case 5:
                    lancamentos.put(5, lancamentos.get(5)+1);
                    break;
                case 6:
                    lancamentos.put(6, lancamentos.get(6)+1);
                    break;
            }
        }

        Set<Map.Entry<Integer, Integer>> entries = lancamentos.entrySet();
        for (Map.Entry<Integer, Integer> e: entries) {
            System.out.println("O lado "+e.getKey()+" caiu "+e.getValue()+" vezes.");
        }

    }
}
