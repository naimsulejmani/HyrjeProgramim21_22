package cacttus.education.operators;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("A=");
        double a = reader.nextDouble();
        System.out.print("B=");
        double b = reader.nextDouble();
        System.out.print("C=");
        double c = reader.nextDouble();

        System.out.printf("%.2fX^2 + %.2fX + %.2f = 0%n", a, b, c);

        double median = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + median) / (2 * a);
        double x2 = (-b - median) / (2 * a);
        System.out.printf("X1 = %.2f%n", x1);
        System.out.printf("X2 = %.2f%n", x2);

    }
}














