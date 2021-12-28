package cacttus.education.iterations.do_while;

import java.util.Scanner;

public class ReverseNumberOfInt {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int number = reader.nextInt();
        int reverseNumber = 0;
        do {
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;
        } while (number > 0);

        System.out.println("Reverse number is: " + reverseNumber);
    }
}
