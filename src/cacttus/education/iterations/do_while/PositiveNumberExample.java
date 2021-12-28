package cacttus.education.iterations.do_while;

import java.util.Scanner;

public class PositiveNumberExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter a positive number!");
            num = reader.nextInt();
            if (num <= 0) {
                System.out.println("Input error!!!! Try again!");
            }
        } while (num <= 0);
    }
}
