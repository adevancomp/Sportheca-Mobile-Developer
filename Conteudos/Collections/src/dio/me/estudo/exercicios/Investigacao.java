package dio.me.estudo.exercicios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Investigacao {
    public static void main(String[] args) {
        List<String> lista_perguntas = new ArrayList<>(5);
        List<String> lista_respostas = new ArrayList<>(5);
        Scanner scan = new Scanner(System.in);

        lista_perguntas.add("Telefonou para a vítima? ");
        lista_perguntas.add("Esteve no local do crime? ");
        lista_perguntas.add("Mora perto da vítima? ");
        lista_perguntas.add("Devia vítima? ");
        lista_perguntas.add("Já trabalhou com a vítima? ");

        for(int i=0;i< lista_perguntas.size();i++){
            System.out.print(i+" "+lista_perguntas.get(i));
            lista_respostas.add(scan.next());
        }

        /*
        Se a pessoa responder positivamente a 2 questões ela é classficada como "Suspeita",
        entre 3 e 4 como "Cúmplice" e 5 como assasina. Caso contrário ela é classificada
        como "Inocente".
        */

        Iterator<String> it = lista_respostas.iterator();
        int respondidas_sim=0;
        while(it.hasNext()){
            if(it.next().equalsIgnoreCase("sim")){
                respondidas_sim++;
            }
        }
        switch (respondidas_sim){
            case 2:
                System.out.println("Suspeita !");
                break;
            case 3:
                System.out.println("Cúmplice");
                break;
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assasina !");
                break;
            case 0:
                System.out.println("Inocente !");
                break;
            default:
                System.out.println("Indefinido !");
        }

    }
}
