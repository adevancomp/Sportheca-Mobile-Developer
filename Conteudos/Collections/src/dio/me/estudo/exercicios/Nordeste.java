package dio.me.estudo.exercicios;

import java.util.*;

public class Nordeste {
    public static void main(String[] args) {
        Map<String,Integer> nordeste = new LinkedHashMap(){{
            put("PE",9616621);
            put("AL",3351543);
            put("CE",9187103);
            put("RN",3534265);
        }};

        //Substitua a população do Estado de RN para 3.534.165
        nordeste.put("RN",3534165);
        //Confira se o estado PB está no dicionário, caso não adicione PB - População 4.039.277
        if(!nordeste.containsKey("PB")){
            nordeste.put("PB",4039277);
        }
        //Exiba todos os estados e suas populações na ordem em que foi informado.
        Set<Map.Entry<String, Integer>> entries = nordeste.entrySet();
        System.out.println("Exiba todos os estados e suas populações na ordem em que foi informado.");
        for (Map.Entry<String, Integer> e: entries) {
            System.out.println("Estado: "+e.getKey()+" População: "+e.getValue());
        }
        //Exiba todos os estados e suas populações em ordem alfabética.
        Map<String,Integer> nordesteOrdemAlfabetica = new TreeMap<>(nordeste);
        Set<Map.Entry<String, Integer>> entries1 = nordesteOrdemAlfabetica.entrySet();
        System.out.println("Exiba todos os estados e suas populações em ordem alfabética.");
        for (Map.Entry<String, Integer> e: entries1) {
            System.out.println("Estado: "+e.getKey()+" População: "+e.getValue());
        }
        //Exiba o estado com a menor população e sua quantidade.
        Integer menorPopulacao = Collections.min(nordeste.values());
        System.out.println("Exiba o estado com a menor população e sua quantidade.");
        for (Map.Entry<String, Integer> e: entries) {
            if(menorPopulacao.equals(e.getValue())){
                System.out.println("Estado: "+e.getKey()+" População: "+menorPopulacao);
            }
        }
        //Exiba o estado com a maior população e sua quantidade.
        Integer maiorPopulacao = Collections.max(nordeste.values());
        System.out.println("Exiba o estado com a maior população e sua quantidade.");
        for (Map.Entry<String, Integer> e: entries) {
            if(maiorPopulacao.equals(e.getValue())){
                System.out.println("Estado: "+e.getKey()+" População: "+maiorPopulacao);
            }
        }
        //Exiba a soma da população desses estados.
        int soma =0;
        for (Map.Entry<String, Integer> e: entries) {
            soma+=e.getValue();
        }
        System.out.println("Exiba a soma e a média da população desses estados.");
        System.out.println("Soma da população: "+soma);
        double media = (double) (soma / nordeste.size());
        System.out.println("Média : "+media);
        //Remova os estados com a população menor que 4.000.000.
        for (Map.Entry<String, Integer> e: entries1){
            if(e.getValue()<4000000){
                nordeste.remove(e.getKey());
            }
        }
        System.out.println("Remova os estados com a população menor que 4.000.000");
        Set<Map.Entry<String, Integer>> entries2 = nordeste.entrySet();
        for (Map.Entry<String, Integer> e: entries2) {
            System.out.println("Estado: "+e.getKey()+" População: "+e.getValue());
        }
        //Apague o dicionário.
        nordeste.clear();
        nordesteOrdemAlfabetica.clear();
        //Verifique se ele está vazio.
        System.out.println("O dicionário Nordeste está vazio ? "+nordeste.isEmpty()+" O dicionário Nordeste Ordem Alfabética está vazio ? "+ nordesteOrdemAlfabetica.isEmpty());
    }
}
