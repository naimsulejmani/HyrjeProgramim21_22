package cacttus.education.iterations.do_while.ushtrime;

import java.util.Scanner;

public class NumratDoWhile {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("SHkruaj deri te cili numer deshironi te shfaqni: ");
        int numri = reader.nextInt();
        int counter = 1;
        do {
            System.out.printf("%d %10d %10d %10.2f%n",
                    counter,
                    counter * counter,
                    counter * counter * counter,
                    Math.sqrt(counter));
        } while (++counter <= numri);

    }
}
