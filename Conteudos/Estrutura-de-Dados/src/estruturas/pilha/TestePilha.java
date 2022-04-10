package estruturas.pilha;

import notipos.No;

public class TestePilha {
    public static void main(String[] args) {
        Pilha<Integer> pilha = new Pilha<>();
        System.out.println("A pilha está vazia ? "+pilha.isEmpty());
        pilha.push(10);
        System.out.println("Adiciona o conteúdo 10 na pilha\n"+pilha);
        pilha.push(20);
        System.out.println("Adiciona o conteúdo 20 na pilha\n"+pilha);
        pilha.push(30);
        System.out.println("Adiciona o conteúdo 30 na pilha\n"+pilha);
        System.out.println(pilha.pop());
        System.out.println(pilha);
        System.out.println(pilha.pop());
        System.out.println(pilha.pop());
        System.out.println(pilha.isEmpty());
        System.out.println(pilha);

    }
}
