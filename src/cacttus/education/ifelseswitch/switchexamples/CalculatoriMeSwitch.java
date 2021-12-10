package cacttus.education.ifelseswitch.switchexamples;

import java.util.Scanner;

public class CalculatoriMeSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj njerin nga operatoret (+, -, *, /, %)");
        char operatori = reader.next().charAt(0);
        double rezultati;
        System.out.println("Shkruani numrin e pare");
        double numri1 = reader.nextDouble();

        System.out.println("Shkruani numrin e dyte");
        double numri2 = reader.nextDouble();

        switch (operatori) {
            case '+':
                rezultati = numri1 + numri2;
                break;
            case '-':
                rezultati = numri1 - numri2;
                break;
            case '*':
                rezultati = numri1 * numri2;
                break;
            case '/':
                rezultati = numri1 / numri2;
                break;
            case '%':
                rezultati = numri1 % numri2;
                break;
            default:
                System.out.println("Nuk keni dhene operatore te sakte");
                return;
        }
        System.out.printf("%.2f %s %.2f = %.2f", numri1, operatori, numri2, rezultati);
    }
}




