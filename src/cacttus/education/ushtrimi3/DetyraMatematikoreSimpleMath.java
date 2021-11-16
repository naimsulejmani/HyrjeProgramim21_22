package cacttus.education.ushtrimi3;

import java.util.Scanner;

public class DetyraMatematikoreSimpleMath {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani numrin e I: ");
        double numriI = reader.nextDouble();
        System.out.print("Shkruani numrin e II: ");
        double numriII = reader.nextDouble();
        double mbledhja = numriI + numriII;
        double ndryshimi = numriI - numriII;
        double prodhimi = numriI * numriII;
        double pjestimi = numriI / numriII;
        double modulo = numriI % numriII;
        System.out.println("------------------------");
        System.out.printf("%.2f + %.2f= %.2f %n", numriI,numriII,mbledhja);
        System.out.printf("%.2f - %.2f = %.2f %n", numriI,numriII, ndryshimi);
        System.out.printf("%.2f * %.2f= %.2f %n", numriI, numriII, prodhimi);
        System.out.printf("%.2f / %.2f = %.2f %n", numriI, numriII, pjestimi);
        System.out.printf("%.2f %% %.2f = %.2f %n", numriI, numriII, modulo);
        System.out.printf("%.2f %s %.2f = %.2f %n", numriI, "%",numriII, modulo);








    }
}












