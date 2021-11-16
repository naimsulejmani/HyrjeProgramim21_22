package cacttus.education.ushtrimi3;

import java.util.Scanner;

public class DetyraForca1 {
    public static void main(String[] args) {
        System.out.println("Detyra fizike per kalkulimin e Forces se trupit!");
        System.out.println("Forca e trupit eshte shprehur ne formulen");
        System.out.println("F = m * a;");
        System.out.println(
        "ku, F eshte FORCA e trupit \n m eshte masa e trupit \n a eshte nxitimi i trupit");

        System.out.println("----------------------------------------");
        Scanner user = new Scanner(System.in);
        System.out.print("Shkruaj masen e trupit: ");
        double mass = user.nextDouble();
        System.out.print("Shkruaj nxitimin e trupit: ");
        double acceleration = user.nextDouble();
        //F = m * a
        double force = mass * acceleration;

        System.out.printf("%.2f * %.2f = %.2f%n", mass,acceleration,force);
        System.out.println();
        System.out.println();
        System.out.println("\n\n\nForca eshte e barabarte me: "+force);

    }
}









