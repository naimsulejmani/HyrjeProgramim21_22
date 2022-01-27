package cacttus.education.ushtirme_provim;

import java.util.Random;
import java.util.Scanner;

public class DetyratTjera {

    static Scanner reader = new Scanner(System.in);

    public static void main(String[] args) {
        //convertInchToMeter();
        //howFarFromLightningAreYou();
        //   truthTable();
       // printSingleLineString();
        detyreMesatareErende1();
    }

    private static void convertInchToMeter() {
        System.out.println("Shkruja vleren ne inch: ");
        double inch = reader.nextDouble();
        System.out.printf("Vlera ne meter eshte: %.2f", inch / 39.37d);
    }

    private static void howFarFromLightningAreYou() {
        Random random = new Random();
        int second = random.nextInt(6, 10);
        System.out.printf("Je larg vetetimes: %d metra", second * 340);
    }

    private static void truthTable() {
        boolean[] p = {false, true, false, true};
        boolean[] q = {false, false, true, true};
        //table header
        System.out.printf("p        q        p&q        p|q        p^q        !p");
        System.out.println("\n-------------------------------------------------------");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%b %8b %8b %8b %8b %8b%n",
                    p[i], q[i], p[i] & q[i], p[i] | q[i], p[i] ^ q[i], !p[i]
            );
        }
    }

    private static void printSingleLineString() {
        String line = "One\nTwo\nThree";
        System.out.println(line);
    }

    private static void convertStringToPrimitive() {
        //use Wrapper class for each primitive
        String value = "100";
        System.out.println(Integer.parseInt(value));
        System.out.println(Double.parseDouble(value));
    }

    public static void detyreMesatareErende() {
        //sa numra
        int number = reader.nextInt();
        int sum = 0;

        while (number-- > 0) {
            int newNumber = reader.nextInt();
            if (newNumber % 6 == 0) {
                sum += newNumber;
            }
        }
        System.out.println("Rezultati = " + sum);
    }

    public static void detyreMesatareErende1() {
//        int number = reader.nextInt();
//        int sum = 0;
//        while (reader.hasNext() && number-- > 0) {
//            int newNumber = reader.nextInt();
//            if (newNumber % 6 == 0) {
//                sum += 6;
//            }
//        }
       // System.out.println(sum);
    }
}







