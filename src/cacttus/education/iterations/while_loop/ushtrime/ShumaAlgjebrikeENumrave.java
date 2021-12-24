package cacttus.education.iterations.while_loop.ushtrime;

import java.util.Scanner;

public class ShumaAlgjebrikeENumrave {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin N: ");
        int n = reader.nextInt();
        int x = 0;
        int sum = 0;

        while (x <= n) {
            sum += (x - 2);
            x++;
        }
        System.out.println("Shuma e numrave = " + sum);
    }
}






