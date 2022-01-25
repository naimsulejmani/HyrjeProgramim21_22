package cacttus.education.methods.detyra_provimi_aka;

import java.util.Scanner;

public class CountVowelChars {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani nje tekst: ");
        String teksti = reader.nextLine();
        int count = 0;
        for (int i = 0; i < teksti.length(); i++) {
            char shkronja = teksti.toLowerCase().charAt(i);
            if (isVowel(shkronja))
                count++;
        }
        System.out.println("Ky tekst ka total zanore:  " + count);
    }

    static boolean isVowel(char shkronja) {

        return "aeioyu".contains("" + shkronja);
//        String vowels = "aeioyu";
//        return vowels.contains("" + shkronja);


//        return shkronja == 'a' || shkronja == 'e' ||
//                shkronja == 'u' || shkronja == 'o' || shkronja == 'i' ||
//                shkronja == 'y';
//        if (shkronja == 'a' || shkronja == 'e' ||
//                shkronja == 'u' || shkronja == 'o' || shkronja == 'i' ||
//                shkronja == 'y')
//            return true;
//        else return false;
    }
}
