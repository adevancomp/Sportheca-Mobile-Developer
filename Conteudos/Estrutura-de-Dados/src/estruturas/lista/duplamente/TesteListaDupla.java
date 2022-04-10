package estruturas.lista.duplamente;

public class TesteListaDupla {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<>();
        lista.add("1 - Adevan");
        lista.add("2 - Neves");
        lista.add("3 - Santos");
        lista.add("4 - UEA");
        System.out.println(lista);
        lista.remove(2);
        System.out.println(lista);
        lista.add(2,"stem");
        System.out.println(lista);

        lista.remove(0);
        System.out.println(lista);
        lista.remove(0);
        System.out.println(lista);
    }
}
