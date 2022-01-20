package cacttus.education.methods.ushtrime;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lexo nje numer per ti shtypur numrat nga 1 deri ne N:");
        int number = scanner.nextInt();
        printNumbers(number);
        System.out.println();
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Detyra me shtyp vargjet");
        printArray(array);
        System.out.println();
        printArray(new int[]{99, 100, 200, -99});

        //printNumbers(100);
    }

    static void printArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%5d", array[i]);
        }
    }


    static void printNumbers(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.printf("%5d", i);
        }
    }
}
