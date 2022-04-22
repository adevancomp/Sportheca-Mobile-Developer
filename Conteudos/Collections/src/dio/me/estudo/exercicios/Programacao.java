package dio.me.estudo.exercicios;

import dio.me.estudo.exercicios.models.LinguagemFavorita;

import java.util.*;

public class Programacao {
    public static void main(String[] args) {
        Set<LinguagemFavorita> linguagens_listas = new LinkedHashSet(){{
            add (new LinguagemFavorita("Python",1989,"Pycharm"));
            add (new LinguagemFavorita("C",1972,"CodeBlocks"));
            add (new LinguagemFavorita("Java",1991,"Intellij"));
        }};

        for (LinguagemFavorita l: linguagens_listas) {
            System.out.println("inserção: "+l);
        }

        System.out.println("------------------------------");

        Set<LinguagemFavorita> linguagens_listas_ordenadas_nome = new TreeSet<>(linguagens_listas);
        for (LinguagemFavorita l: linguagens_listas_ordenadas_nome) {
            System.out.println("ordenada por nome: "+l);
        }

        System.out.println("------------------------------");

        Set<LinguagemFavorita> linguagens_listas_ordenadas_ide = new TreeSet<>(new ComparatorIDE());
        linguagens_listas_ordenadas_ide.addAll(linguagens_listas);

        for (LinguagemFavorita l: linguagens_listas_ordenadas_ide) {
            System.out.println("ordenada por IDE: "+l);
        }

        System.out.println("------------------------------");

        Set<LinguagemFavorita> linguagens_listas_ordenadas_ano_nome = new TreeSet<>(new ComparatorAnoNome());
        linguagens_listas_ordenadas_ano_nome.addAll(linguagens_listas);

        for (LinguagemFavorita l: linguagens_listas_ordenadas_ano_nome) {
            System.out.println("ordenada por ano de criação e depois nome: "+l);
        }

        System.out.println("------------------------------");

        Set<LinguagemFavorita> linguagens_listas_ordenadas_nome_ano_ide = new TreeSet<>(new ComparatorNomeAnoIde());
        linguagens_listas_ordenadas_nome_ano_ide.addAll(linguagens_listas);

        for (LinguagemFavorita l: linguagens_listas_ordenadas_nome_ano_ide) {
            System.out.println("ordenada por nome, depois ano e ide: "+ l);
        }
    }
}

class ComparatorIDE implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        return l1.getIDE().compareTo(l2.getIDE());
    }
}

class ComparatorAnoNome implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int primeiro = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(primeiro!=0) return primeiro;
        return l1.getNome().compareTo(l2.getNome());
    }
}

class ComparatorNomeAnoIde implements Comparator<LinguagemFavorita>{

    @Override
    public int compare(LinguagemFavorita l1, LinguagemFavorita l2) {
        int nome = l1.getNome().compareTo(l2.getNome());
        if(nome!=0) return nome;
        int ano = l1.getAnoDeCriacao().compareTo(l2.getAnoDeCriacao());
        if(ano!=0) return ano;

        return l1.getIDE().compareTo(l2.getIDE());
    }
}

