package cacttus.education.iterations.while_loop;

import java.util.Scanner;

public class Num1Num2 {
    public static void main(String[] args) {
        int num1, num2;
        Scanner reader = new Scanner(System.in);
        System.out.println("Write two integers: ");
        num1 = reader.nextInt();
        num2 = reader.nextInt();
        int counter = 0;

        if (num1 == 0) {
            System.out.println("Nuk lejohet zero vlera e pare");
            return;
        }

        while (num2 >= num1) {
            counter++;
            num2 -= num1;
        }
        System.out.printf("Numri i dyte e ka %d here numrin e pare.%n", counter);
    }
}
