package dio.me.ordft;

import java.util.*;

import static java.lang.System.in;

public class UniformesDeFinalDeAno {
    public static void main(String[] args) {
        int N; //N é a quantidade de uniformes a serem feitas para aquela turma
        Scanner sc = new Scanner(in);
        String[] linha2;
        List<Pessoa> listaUniformes = new ArrayList<>();

        String linha = sc.next();
        N= Math.min(Integer.parseInt(linha), 60);

        for (int i = 0; i < N*2; i++) {
            linha=sc.nextLine();
            sc.next();
            linha2=sc.nextLine().split(" ");
            listaUniformes.add(new Pessoa(linha,linha2));
        }

        /* Agora é necessário ordenar esta coleção segundo esses critérios:
            - ordenadas pela cor em ordem ascendente,
            seguido pelos tamanhos em ordem descendente e
            por último por ordem ascendente de nome
         */

        Set<Pessoa> uniformesOrganizados = new TreeSet<>(listaUniformes);

        uniformesOrganizados.forEach(System.out::println);

    }
}

class Pessoa implements  Comparable<Pessoa>{
    public String nome;
    public String cor;
    public String tamanhoCamisa;

    public Pessoa(String linha1, String[] linha2){
        nome=linha1;
        cor=linha2[0];
        tamanhoCamisa=linha2[1];
        //Branco P Maria João
    }

    @Override
    public String toString() {
        return String.format("%s %s %s",cor,tamanhoCamisa,nome);
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        /*
        ordenadas pela cor em ordem ascendente,
        seguido pelos tamanhos em ordem descendente e
        por último por ordem ascendente de nome
        */

        Integer comparadorCor = cor.compareTo(pessoa.cor);
        if(!comparadorCor.equals(0)) return comparadorCor;
        Integer comparadorTamanho = pessoa.tamanhoCamisa.compareTo(tamanhoCamisa);
        if(!comparadorTamanho.equals(0)) return comparadorTamanho;
        Integer comparadorNome = nome.compareTo(pessoa.nome);
        return comparadorTamanho;

    }
}
