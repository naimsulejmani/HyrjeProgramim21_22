package cacttus.education.iterations.while_loop.ushtrime;

import java.util.Scanner;

public class Ushtrime1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin N: ");
        int n = reader.nextInt();
        int x = 1;
        double sum = 0;

        while (x <= n && n <= 500) {
            sum += ((double) (x * x - 2 * x + 3) / (2 * x - 1));
            x++;
        }
        System.out.printf("Shuma e numrave =  %.2f", sum);
    }
}
