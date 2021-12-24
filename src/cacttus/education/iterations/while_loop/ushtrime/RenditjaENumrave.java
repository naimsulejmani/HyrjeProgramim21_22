package cacttus.education.iterations.while_loop.ushtrime;

import java.util.Scanner;

public class RenditjaENumrave {
    public static void main(String[] args) {
        /*
                Cka dijme per detyren:
                    1. Deri ku kemi me shku (limit)
                    2. Startin prej ku kemi me u nise -> 1
                    3. Menyra rritese eshte per 1
                    4. Pas secilit numer presje
                    5. cdo treti numer rresht i ri me u shfaq
                    6. aty ku mungojne numrat shto numer zero
         */

        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje numer: ");
        int limit = reader.nextInt();
        int counter = 0;

        while (counter < limit) {

            if (counter % 3 == 0) System.out.println();

            System.out.printf("%d,", counter + 1);

            counter++;
        }

        if (limit % 3 == 1) {
            System.out.print("0,0,");
        } else if (limit % 3 == 2) {
            System.out.print("0,");
        }

    }
}



