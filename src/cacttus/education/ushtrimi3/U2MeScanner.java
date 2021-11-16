package cacttus.education.ushtrimi3;

import java.util.Scanner;

public class U2MeScanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Emri juaj: ");
        String emri = reader.nextLine();

        /*
                %s ose %S - nenkupton String-text
                %n - newline
         */
        System.out.printf("Hello %s!%n",emri);
        System.out.printf("%s,%n oooooo %s,%n oooo %s, qetsi!",emri,emri,emri);

    }
}









