package cacttus.education.ushtrimi3;

import java.util.Scanner;

public class PerimetriIRrethit {
    public static void main(String[] args) {
        // Perimetri = 2 * PI * rrezja

        Scanner reader = new Scanner(System.in);

        System.out.println("Detyra qe llogarite perimetrin e rrethit!");
        System.out.print("Shkruaj rrezen e rrethit: ");
        double rrezja = reader.nextDouble();
        final double PI = 3.14;
        //PI = 3.15;
        //double perimetri = 2 * PI * rrezja;
        double perimetri = 2 * Math.PI * rrezja;
        System.out.printf("Perimetri i rrethit eshte: %.2f%n", perimetri);


    }
}









