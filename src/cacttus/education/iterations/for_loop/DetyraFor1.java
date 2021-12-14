package cacttus.education.iterations.for_loop;

import java.util.Scanner;

public class DetyraFor1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int numri = reader.nextInt();

        for (int i = 0; i < numri; i++) {
            for (int j = 0; j < numri - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
