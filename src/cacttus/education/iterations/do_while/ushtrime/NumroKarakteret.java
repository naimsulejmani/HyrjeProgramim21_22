package cacttus.education.iterations.do_while.ushtrime;

import java.util.Scanner;

public class NumroKarakteret {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj nje tekst: ");
        String tekst = reader.nextLine();
        //deklarojme variablat ne te cilen do ti ruajme
        //numratoret e karaktereve te ndryshme te gjuhes anlgo-shqipe
        int counterZanore = 0,
                counterBashketingellore = 0,
                counterShenjatEPikesimit = 0;

        int pozita = 0;
        tekst = tekst.toLowerCase();
        do {
            //merre shkronjen ne ate pozite dhe krahaso se a eshte bashketingllore apo zanore etj etj
            char shkronja = tekst.charAt(pozita);
            if (shkronja == 'a' || shkronja == 'e' || shkronja == 'y' ||
                    shkronja == 'u'
                    || shkronja == 'i' || shkronja == 'o') {
                counterZanore++;
            } else if (shkronja >= 'a' && shkronja <= 'z') {
                counterBashketingellore++;
            } else if (shkronja == '.' || shkronja == ',' ||
                    shkronja == '!' || shkronja == '?' || shkronja == '"' ||
                    shkronja == '\'') {
                counterShenjatEPikesimit++;
            }
        } while (++pozita < tekst.length());

        System.out.println("----------------------------------------");
        System.out.printf("Zanore: %d %n",counterZanore);
        System.out.printf("Bashketingellore: %d %n",counterBashketingellore);
        System.out.printf("Shenja te pikesimit: %d %n",counterShenjatEPikesimit);
        System.out.println("----------------------------------------");
    }
}










