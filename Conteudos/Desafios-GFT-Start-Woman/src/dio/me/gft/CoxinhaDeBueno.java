package dio.me.gft;

import java.util.Scanner;

public class CoxinhaDeBueno {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        String[] inputSplit = input.split(" ");
        Double media = Double.parseDouble(inputSplit[0])/Double.parseDouble(inputSplit[1]);
        System.out.printf("%.2f",media);
    }
}
