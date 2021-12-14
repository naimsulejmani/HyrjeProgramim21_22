package cacttus.education.iterations.for_loop;

import java.util.Scanner;

public class PrimeNumberFor {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer per te kontrolluar se a eshte numer i thjeshte:");
        int numri = reader.nextInt();

        boolean isPrime = true;

        for (int index = 2; index <= numri / 2 && isPrime; index++) {
            if (numri % index == 0) {
                isPrime = false;
            }
        }

        if (isPrime) {
            System.out.printf("Numri %d eshte numer i thjeshte!", numri);
        } else {
            System.out.printf("Numri %d nuk eshte numer i thjeshte!", numri);
        }
    }
}
