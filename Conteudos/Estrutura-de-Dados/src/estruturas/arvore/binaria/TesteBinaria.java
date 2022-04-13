package estruturas.arvore.binaria;

import model.Gato;

public class TesteBinaria {
    public static void main(String[] args) {
        Binaria<Gato> binaria = new Binaria<>();
        binaria.inserir(new Gato("Rajado",3));
        binaria.inserir(new Gato("Marrom",2));
        binaria.inserir(new Gato("Mel",8));
        binaria.inserir(new Gato("Preto",1));

        binaria.exibirInOrdem();

        binaria.remover(new Gato("Rajado",3));
        binaria.exibirPreOrdem();

    }

}
