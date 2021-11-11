package cacttus.education.datatypes_and_variables;

import java.util.Scanner;

public class UshtrimeMeScanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj emrin: ");
        String emri = reader.nextLine();

        System.out.println("Emri juaj eshte: " + emri);
    }
}
