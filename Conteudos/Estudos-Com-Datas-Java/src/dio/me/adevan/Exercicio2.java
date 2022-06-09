package dio.me.adevan;

import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * Um cliente tem 10 dias para pagar a fatura após pagar sua fatura após a sua data de vencimento
 * sem que os juros sejam cobrados
 *
 * Caso esta data caia em um sábado ou domingo, o cliente pode pagar na segunda-feira seguinte
 *
 * Crie uma estrutura que receba uma data de vencimento e calcule quantos dias ele tem para pagar
 *
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com uma data de vencimento: ");
        long dataVencimento = sc.nextLong();
        Calendar vencimento = Calendar.getInstance();
        vencimento.setTimeInMillis(dataVencimento);
        //Verificar uma nova data 10 dias após essa data e verificar se ela é um final de semana
        
    }
}
