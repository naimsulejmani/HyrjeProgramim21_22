package cacttus.education.iterations.for_loop;

import java.util.Scanner;

public class FactorielFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer per te llogaritur faktorielin: ");
        int numri = reader.nextInt();

        int factoriel = 1;
        for (int index = numri; index >= 1; index--) {
            factoriel *= index;
        }

        System.out.printf("%d! = %d", numri, factoriel);

    }
}










