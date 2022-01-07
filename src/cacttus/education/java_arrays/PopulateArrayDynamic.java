package cacttus.education.java_arrays;

import java.util.Scanner;

public class PopulateArrayDynamic {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Sa shoke po don me i regjistru: ");
        int numri = reader.nextInt();
        //deklaro dhe inicializo vargun
        String[] shoket = new String[numri];
        reader.nextLine();//per zbrazje te buffer;

        //mbushe te dhena vargun nga fillimi deri ne fund nepermjet reader(scanner)
        for (int i = 0; i < shoket.length; i++) {
            System.out.printf("Shkruaj emrin e shokut %d: ", i + 1);
            shoket[i] = reader.nextLine();
        }
        //shfaq elementet e vargut nje nga nje
        for (int i = 0; i < shoket.length; i++) {
            System.out.printf("%d -> %s %n", i + 1, shoket[i]);
        }
    }
}








