package cacttus.education.iterations.for_loop;

import java.util.Scanner;

public class DetyraFor2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer");
        int numri = reader.nextInt();

        for (int i = 1; i <= numri; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
