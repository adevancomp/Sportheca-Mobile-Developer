package estruturas.fila;

public class TesteFila {
    public static void main(String[] args) {
        Fila<Double> fila = new Fila<>();
        System.out.println("Fila está vazia ? "+ fila.isEmpty());
        fila.enqueue(19.98);
        System.out.println("Adiciona 19.88 :\n"+fila);
        System.out.println("Quem é o primeiro elemento da fila ?"+fila.first());
        fila.enqueue(29.98);
        System.out.println(fila);
        System.out.println("Desenfileirando o 19.98: "+fila.dequeue());
        System.out.println(fila);
        System.out.println("Quem é o primeiro agora ? "+fila.first());
        fila.dequeue();
        System.out.println(fila);
    }
}
