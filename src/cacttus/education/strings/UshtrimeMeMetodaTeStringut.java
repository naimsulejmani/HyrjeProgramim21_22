package cacttus.education.strings;

import java.util.Locale;

public class UshtrimeMeMetodaTeStringut {
    public static void main(String[] args) {
        String text = "Learning Java is not easy! Ah Java bre!";

        char shkronjaX = text.charAt(0);
        char shkornjaY = text.charAt(text.length() - 1);
        System.out.printf("Shkronja e pare %s dhe e fundit %s %n", shkronjaX, shkornjaY);

        System.out.printf("%s i ka gjithesej %d karaktere %n", text, text.length());

        String newText = String.format("%s It's not true, it's easy when you want", text);
        System.out.println(newText);

        String sub1 = text.substring(9);
        System.out.println(sub1);

        String sub2 = text.substring(9, 13);
        System.out.println(sub2);

        boolean hasJava = text.contains("Java");
        boolean hasjava = text.contains("java");

        System.out.println("hasJava = " + hasJava);
        System.out.println("hasjava = " + hasjava);

        String joinText = String.join(";", "Naim", "Filanin", "Fisteken");
        System.out.println(joinText);

        boolean areEqual = text.equals(newText.substring(0, text.length()));

        System.out.println(areEqual);

        boolean isEmptyText = text.isEmpty(); //""
        boolean isBlankText = text.isBlank(); //"    "
        System.out.println("IsEmpty = " + isEmptyText);
        System.out.println("IsBlank = " + isBlankText);

        String concat = text.concat("\nC# is same!").concat("\nJavaScript is same!");
        System.out.println(concat);


        String replacedText = text.replace("Java", "C#");
        System.out.println(replacedText);


        String name = "Fatlinda";

        System.out.println(name.equalsIgnoreCase("FATLINDA"));

        //        String text = "Learning Java is not easy! Ah Java bre!";
        String[] words = text.split(" ");

        System.out.println(words[0]);
        System.out.println(words[words.length - 1]);

        System.out.println(text.indexOf("Java"));

        System.out.println(text.indexOf("Java",15));

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        String txt = "   TRIM    ";
        System.out.println(txt.length());
        System.out.println(txt.trim().length());
        String numri3 = String.valueOf(3);
        String repeatedText = text.repeat(3);
        System.out.println(repeatedText);
    }
}
