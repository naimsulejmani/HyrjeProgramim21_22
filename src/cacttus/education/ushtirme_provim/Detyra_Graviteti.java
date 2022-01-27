package cacttus.education.ushtirme_provim;

import java.util.Scanner;

public class Detyra_Graviteti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Shkruaj peshen tuaj ne toke ne kg:  ");
        double pesha = scanner.nextDouble();

        System.out.printf("Pesha e juaj ne hene eshte: %.2f %n",
                pesha * 0.17
        );
    }


}













