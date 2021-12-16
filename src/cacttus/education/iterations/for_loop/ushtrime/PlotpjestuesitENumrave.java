package cacttus.education.iterations.for_loop.ushtrime;

import java.util.Scanner;

public class PlotpjestuesitENumrave {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani nje numer: ");
        int numri = reader.nextInt();
        int counter = 1;
        for (int i = 1; i <= numri / 2; i++) {
            if (numri % i == 0) {
                System.out.printf("%d plotpjestohet me %d %n", numri, i);
                counter++;
            }
        }
        System.out.printf("%d plotpjestohet edhe me vetvete! %n", numri);
        System.out.printf("%d plotpjestohet nga total %d numra te ndryshem!%n",
                numri, counter);
    }
}









