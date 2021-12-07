package cacttus.education.ifelseswitch;

import java.util.Scanner;

public class Detyra2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin e pare: ");
        double numberOne = reader.nextDouble();

        System.out.println("Shkruaj numrin e dyte: ");
        double numberTwo = reader.nextDouble();

        System.out.println("Zgjedh njeren nga operatoret (+,-,*,/,%): ");
        char operator = reader.next().charAt(0);

        double rezultati;

        if (operator == '+') {
            rezultati = numberOne + numberTwo;
        } else if (operator == '-') {
            rezultati = numberOne - numberTwo;
        } else if (operator == '*') {
            rezultati = numberOne * numberTwo;
        } else if (operator == '/') {
            if(numberTwo == 0){
                System.out.printf("nuk lejohet pjestimi me 0!");
                return;
            }else {
            rezultati = numberOne / numberTwo;
            }
        } else if (operator == '%') {
            rezultati = numberOne % numberTwo;
        } else {
            System.out.println("Operatori nuk lejohet!!!!");
            return;
        }

        System.out.printf("%.2f %s %.2f = %.2f",
                numberOne, operator, numberTwo, rezultati);


    }
}



