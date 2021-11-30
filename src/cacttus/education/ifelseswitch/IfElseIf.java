package cacttus.education.ifelseswitch;

import java.util.Scanner;

public class IfElseIf {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa vjet i keni: ");
        int age = reader.nextInt();

        if(age<18) {
            System.out.println("Teper i ri per me punu!");
        }
        else if(age<65) {
            System.out.println("Mundeni me punu!");
        }
        else {
            System.out.println("Penzion te mbare!");
        }

    }
}






