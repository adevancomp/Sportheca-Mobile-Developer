package dio.me.estudo.exercicios;

import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        Set<String> coresArcoIris = new LinkedHashSet<>();
        coresArcoIris.add("Vermelho");
        coresArcoIris.add("Laranja");
        coresArcoIris.add("Amarelo");
        coresArcoIris.add("Verde");
        coresArcoIris.add("Azul");
        coresArcoIris.add("Anil");
        coresArcoIris.add("Violeta");

        //1. Exiba todas as cores uma abaixo da outra.
        for (String e: coresArcoIris) {
            System.out.println("Cor: "+e);
        }

        System.out.println("\n");

        //2. Mostre a quantidade de cores que o arco-íris tem.
        System.out.println("Quantidade de cores em um arco-íris: "+coresArcoIris.size());

        //3. Exiba as cores em ordem alfabética.
        Set<String> coresArcoIrisAlfabetica = new TreeSet<>(coresArcoIris);
        for (String e: coresArcoIrisAlfabetica) {
            System.out.println("Cor (Ordenada): "+e);
        }

        System.out.println("\n");

        //4. Exiba as cores na ordem inversa da que foi informada.
        List<String> coresArcoIrisList = new ArrayList<>(coresArcoIris);
        Collections.reverse(coresArcoIrisList);
        for (String e: coresArcoIrisList) {
            System.out.println("Cor (Ordem Inversa da Inserção): "+e);
        }

        System.out.println("\n");

        //5. Exiba todas as cores que começam com a letra "v"
        Iterator<String> it = coresArcoIris.iterator();
        while(it.hasNext()){
            String cor = it.next();
            if(cor.startsWith("V")){
                System.out.println("Começa com 'v': "+cor);
            }
        }
        System.out.println("\n");

        //6. Remova todas as cores que não começam com a letra "v"
        it = coresArcoIrisAlfabetica.iterator();
        while(it.hasNext()){
            String cor = it.next();
            if(!cor.startsWith("V")){
                coresArcoIris.remove(cor);
            }
        }
        System.out.println("Removendo as cores que não começam com 'v' : "+coresArcoIris);

        System.out.println("\n");
        //7. Limpe o Conjunto
        coresArcoIris.clear();

        //8. Confira se o conjunto está vazio
        System.out.println("O conjunto arco iris está vazio ? "+coresArcoIris.isEmpty());
    }
}
