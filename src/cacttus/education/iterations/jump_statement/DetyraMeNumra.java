package cacttus.education.iterations.jump_statement;

import java.util.Scanner;

public class DetyraMeNumra {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int n = reader.nextInt();
        //unaza e jashtme qe shkon rresht per rreshti
        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.printf("%3d", j);
            }
            for (int z = i; z >= 1; z--) {
                System.out.printf("%3d", z);
            }

            System.out.println();
        }
    }
}
