package estruturas.recursosjava;

import java.util.*;
import model.Carro;
import model.Gato;

public class Testes {
    public static void main(String[] args) {

        List<Carro> listaCarros = new ArrayList<>();
        listaCarros.add(new Carro("Ford"));
        listaCarros.add(new Carro("Chevrolet"));
        listaCarros.add(new Carro("Volkswagen"));

        System.out.println(listaCarros.contains(new Carro("Ford")));
        System.out.println(new Carro("Ford").hashCode());
        Carro c1 = new Carro("Ford");
        Carro c2 = new Carro("Chevrolet");
        System.out.println(c1.equals(c2));

        System.out.println("\n Teste Stack \n");

        Stack<Carro> carros = new Stack<>();
        carros.push(new Carro("Ford"));
        carros.push(new Carro("Chevrolet"));
        carros.push(new Carro("Volkswagen"));
        System.out.println(carros);
        System.out.println("Topo da pilha: "+carros.pop());
        System.out.println(carros);
        System.out.println(carros.peek());
        System.out.println(carros);

        System.out.println("\n Teste Stack \n");

        System.out.println("\n Teste Queue Fila,LinkedList\n");

        Queue<Gato>  gatos = new LinkedList<>();
        gatos.add(new Gato("Marrom",1));
        gatos.add(new Gato("Rajado",3));
        gatos.add(new Gato("Preto",6));

        System.out.println(gatos);
        System.out.println(gatos.offer(new Gato("Amarelo",4)));
        System.out.println(gatos);
        System.out.println(gatos.poll());
        System.out.println(gatos);
        System.out.println(gatos.size());

        System.out.println("\n Teste Queue Fila,LinkedList\n");

        System.out.println("\n Teste ArrayList \n");

        List<Carro> carros1 = new ArrayList<>();
        carros1.add(new Carro("Ford"));
        carros1.add(new Carro("Chevrolet"));
        carros1.add(new Carro("Fiat"));


        System.out.println(carros1.contains(new Carro("Ford")));
        System.out.println(carros1.get(2));
        System.out.println(carros1.indexOf(new Carro("Fiat")));
        System.out.println(carros1.remove(2));
        System.out.println(carros1);

        System.out.println("\n Teste ArrayList \n");

        System.out.println("\n Set (HashSet) \n");

        Set<Gato> gatoSet = new HashSet<>();
        gatoSet.add(new Gato("Marrom",1));
        gatoSet.add(new Gato("Rajado",3));
        gatoSet.add(new Gato("Preto",6));
        gatoSet.add(new Gato("Branco",10));
        System.out.println(gatoSet);
        Set<Gato> treeCarros = new TreeSet<>(gatoSet);
        System.out.println(treeCarros);//Implementamos o comparable previamente na classe Gato

        System.out.println("\n Set (HashSet) \n");

        System.out.println("\n Map (HashMap)  \n");

        Map<String,String> alunos = new HashMap<>();
        alunos.put("Nome","João");
        alunos.put("Média","0.5");
        alunos.put("Idade","17");
        alunos.put("Turma","3a");
        System.out.println(alunos);
        System.out.println(alunos.keySet());
        System.out.println(alunos.values());
        List<Map<String,String>> listaAlunos = new ArrayList();
        listaAlunos.add(alunos);
        System.out.println(listaAlunos);

        System.out.println("\n Map (HashMap)  \n");

    }
}
