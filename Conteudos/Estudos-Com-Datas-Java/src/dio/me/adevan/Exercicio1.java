package dio.me.adevan;

import java.util.Date;

/**
 * Aplique o que aprendemos :
 *
 * - Descubra o TimeInMilis do dia que você nasceu
 * - Converta em um objeto Date
 * - Verifique se ele é anterior ou posterior a 15 de maio de 2010
 *
 * Encontrei o seguinte site que realiza essa conversão
 * <a href="https://www.epoch101.com/#epochConvertToReadable-Container">Site de tempo</a>
 *
 */

public class Exercicio1 {
    public static void main(String[] args) {
        long timeInMilisNas = 1047542628L;
        long timeExemplo=1589529828L;

        Date dataNascimento = new Date(timeInMilisNas*1000); //O tempo dividido por mil
        Date outraData = new Date(timeExemplo*1000); // data correspondente ao dia 15 de maio de 2020

        System.out.println("Meu aniversário: "+dataNascimento);
        System.out.println("Data exemplo: "+outraData);

        System.out.println("O meu aniversário é anterior ao dia 15 de maio de 2020 ? "+(dataNascimento.before(outraData)));
        System.out.println("O meu aniversário é posterior ao dia 15 de maio de 2020 ? "+(dataNascimento.after(outraData)));
    }
}
