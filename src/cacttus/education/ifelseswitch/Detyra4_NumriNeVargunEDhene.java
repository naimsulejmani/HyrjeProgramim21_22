package cacttus.education.ifelseswitch;

import java.util.Scanner;

public class Detyra4_NumriNeVargunEDhene {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj Nje Numer: ");
        int numri = reader.nextInt();
        if (numri >= -10_000 && numri <= 10_000) { //1_000_000_000
            System.out.println("Numri Eshte Ne Rangun E Dhene!");
        } else {
            System.out.println("Numri Nuk Eshte Ne Rangun E Dhene!");
        }
    }
}
