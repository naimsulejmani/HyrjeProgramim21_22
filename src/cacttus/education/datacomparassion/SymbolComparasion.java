package cacttus.education.datacomparassion;

import java.util.Scanner;

public class SymbolComparasion {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje shkronje te alfabetit angleze:");

        char shkronja = reader.next().charAt(0);

        if(shkronja>='a' && shkronja<='z')
            System.out.println("Shkronje e vogel e alfabetit!");
        else if(shkronja>='A' && shkronja<='Z')
            System.out.println("Shkronje e madhe e alfabetit!");
        else if(shkronja>='0' && shkronja<='9')
            System.out.println("Nuk eshte shkronje por eshte numer!");
        else
            System.out.println("Nuk eshte pjese e alfabetit anglez!");

    }
}
