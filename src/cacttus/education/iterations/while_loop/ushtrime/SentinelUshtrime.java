package cacttus.education.iterations.while_loop.ushtrime;

import java.util.Scanner;

public class SentinelUshtrime {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj dicka: (exit per dalje)");
        String dicka = reader.nextLine();

        while(!dicka.equalsIgnoreCase("exit")) {
            System.out.println(dicka);
            System.out.println("Shkruaj dicka: (exit per dalje)");
            dicka = reader.nextLine();
        }
    }
}







