package cacttus.education.iterations.jump_statement;

import java.util.Scanner;

public class DebugExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        long numri = reader.nextLong();

        for (int i = 2; i <= numri/i; i++) {
            while (numri % i == 0) {
                System.out.print(i + " ");
                numri = numri / i;
            }
        }

        if (numri > 1) System.out.println(numri);
        else System.out.println();


    }
}
