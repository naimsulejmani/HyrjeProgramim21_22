package cacttus.education.ifelseswitch.ushtrimet;

import java.util.Scanner;

public class Detyra2_Plotpjestueshmeria {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani numrin 1: ");
        double numri1 = reader.nextDouble();
        System.out.println("Shkruani numrin 2: ");
        double numri2 = reader.nextDouble();
        if (numri1%numri2 == 0) {
            System.out.printf("%.2f eshte i plotpjestueshem me %.2f",numri1, numri2);
        } else if (numri2%numri1 == 0) {
            System.out.printf("%.2f eshte i plotpjestueshem me %.2f" ,numri2, numri1);
        } else  {
            System.out.printf("Numrat %.2f dhe %.2f nuk jane te plotpjestueshem me njeri tjetrin!"
                    ,numri1,numri2);
        }

    }
}
