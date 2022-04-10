package estruturas.lista.encadeada;

public class TesteLista {
    public static void main(String[] args) {
        Lista<String> minhaListaEncadeada = new Lista<>();

        minhaListaEncadeada.add("teste1");
        minhaListaEncadeada.add("teste2");
        minhaListaEncadeada.add("teste3");
        minhaListaEncadeada.add("teste4");

        System.out.println(minhaListaEncadeada.get(0));
        System.out.println(minhaListaEncadeada.get(1));
        System.out.println(minhaListaEncadeada.get(2));
        System.out.println(minhaListaEncadeada.get(3));

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.remove(3);

        System.out.println(minhaListaEncadeada);

        minhaListaEncadeada.add("valor 2",2);
        System.out.println(minhaListaEncadeada);
    }
}
