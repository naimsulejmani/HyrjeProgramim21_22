package cacttus.education.converts;

import java.util.Scanner;

public class RandomTest {
    public static void main(String[] args) {
        //System.out.println(Math.random());//number prej [0,1)
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruani nje numer deri ku deshironi te gjenerohet nje numer: ");
        int number = reader.nextInt();

        double randomNumber = (int) (number * Math.random());
        double randomNumber2 = (int) Math.random() * number;

        System.out.printf("Random Number 1 = %.2f%n",randomNumber);
        System.out.printf("Random Number 2 = %.2f",randomNumber2);

    }
}






