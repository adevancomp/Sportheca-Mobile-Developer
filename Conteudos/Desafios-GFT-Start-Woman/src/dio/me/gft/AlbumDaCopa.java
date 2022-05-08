package dio.me.gft;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numTotal = scan.nextInt();
        int numFigCompradas = scan.nextInt();
        int figurinhaAtual;
        Set<Integer> setFig = new HashSet<>();

        for (int i=0;i<numFigCompradas;i++) {
            setFig.add(scan.nextInt());
        }
        System.out.println(numTotal - setFig.size());
    }
}
