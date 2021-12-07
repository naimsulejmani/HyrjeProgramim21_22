package cacttus.education.ifelseswitch.ushtrimet;

import java.util.Scanner;
import java.util.function.DoubleFunction;

public class Detyra1_Plotpjestueshem {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani numrin e pare: ");
        double firstNumber = reader.nextDouble();
        System.out.print("Shkruani numrin e dyte: ");
        double secondNumber = reader.nextDouble();
        double result = firstNumber % secondNumber;
        if (result == 0) {
            System.out.printf("%.2f eshte i plotepjestueshem me %.2f", firstNumber, secondNumber);
        } else {
            System.out.printf("%.2f nuk eshte i plotepjestueshem me %.2f", firstNumber, secondNumber);
        }

        System.out.println();
        System.out.printf("%.2f %seshte i plotepjestueshem me %.2f",
                firstNumber, result == 0 ? "" : "nuk ", secondNumber
        );
    }
}







