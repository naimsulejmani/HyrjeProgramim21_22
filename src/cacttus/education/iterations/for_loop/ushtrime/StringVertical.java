package cacttus.education.iterations.for_loop.ushtrime;

import java.util.Scanner;

public class StringVertical {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();

        //shko per secilin indekst te shkronjes
        for (int i = 0; i < text.length(); i++) {
            System.out.printf("%s %10s %n", text.charAt(i), text.charAt(text.length() - 1 - i));
        }
        System.out.println("----------------------------------");
        for (
                int i = 0, j = text.length() - 1;
                i < text.length();
                i++, j--
        ) {
            System.out.printf("%s %10s %n", text.charAt(i), text.charAt(j));
        }
    }
}
