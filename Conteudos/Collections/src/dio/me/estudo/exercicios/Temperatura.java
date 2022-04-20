package dio.me.estudo.exercicios;

import java.util.*;

public class Temperatura {
    public static void main(String[] args) {
        List<Double> tempeturas_semestre = new ArrayList<>(6);
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<6;i++){
            System.out.print("Digite a temperatura do mês "+(i+1)+": ");
            tempeturas_semestre.add(scan.nextDouble());
        }
        //Calcule a média semestral
        Iterator<Double> it = tempeturas_semestre.iterator();
        Double media=0d;
        while(it.hasNext()){
            media+=it.next();
        }
        media /= 6d;

        System.out.println("As temperaturas registradas foram: "+tempeturas_semestre.toString());
        System.out.println("A média semestral foi de : "+media);

        //mostre as temperaturas acima da média e em que mês (por extenso) elas ocorreram
        it = tempeturas_semestre.iterator();
        while(it.hasNext()){
            Double valor=it.next();
            if(valor>media){
                int ind = tempeturas_semestre.indexOf(valor);
                String mes;
                switch (ind){

                    case 0:
                        mes="Janeiro";
                        break;
                    case 1:
                        mes="Fevereiro";
                        break;
                    case 2:
                        mes="Março";
                        break;
                    case 3:
                        mes="Abril";
                        break;
                    case 4:
                        mes="Maio";
                        break;
                    case 5:
                        mes="Junho";
                        break;
                    default:
                        mes="Indefinido";
                }
                System.out.println("Temperatura "+valor+" Mês "+mes);
            }
        }
    }
}
