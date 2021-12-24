package cacttus.education.iterations.while_loop.ushtrime;

import java.util.Scanner;

public class NumratEven {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int counter = 2;

        System.out.println("Shkruaj nje numer");

        int limiti = reader.nextInt();

        while (counter <= limiti) {
            System.out.printf("%d%n", counter);
            counter += 2;
        }

    }
}
