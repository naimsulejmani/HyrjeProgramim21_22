package cacttus.education.java_arrays;

import java.util.Scanner;

public class DetyraMeVargjeSiProvim {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int numri = reader.nextInt();

        //deklarimi dhe inicializimi i vargut me vlera default
        //sipas vleres se dhene nga shfrytezuesi
        int[] vargu = new int[numri];

        //mbushja e vargut me vlera randome nga 1..100
        for (int i = 0; i < vargu.length; i++) {
            //vargut tone ne poziten sipas i i japim vlere randome
            vargu[i] = (int) (Math.random() * 100) + 1;
        }

        //shfaqja e vargut ne menyre prej fillimit deri ne fund
        System.out.println("Paraqitja e vargut FILLIM->FUND");
        System.out.print("{ ");
        for (int i = 0; i < vargu.length; i++) {
            //nese nuk ke mbri ne elementin e fundit (lenght-1) shfaqe prejse,
            //perndyrshe mos e shfaq presjen
            System.out.printf("%d %s", vargu[i], i < vargu.length - 1 ? "," : "");
        }
        System.out.println("}");

        System.out.println("----------------------");
        System.out.println("Paraqitja e vargut FUND -> FILLIMT");
        System.out.print("{ ");
        for (int i = vargu.length - 1; i >= 0; i--) {
            System.out.printf("%d %s", vargu[i], i > 0 ? "," : "");
        }
        System.out.println("}");

        System.out.println("-------------------------");
        int sum = 0;
        for (int i = 0; i < vargu.length; i++) {
            sum += vargu[i];
        }
        System.out.printf("Shuma e numrave te vargut me %d elemente te rastesishme eshte: %d%n",
                vargu.length, sum);
    }
}







