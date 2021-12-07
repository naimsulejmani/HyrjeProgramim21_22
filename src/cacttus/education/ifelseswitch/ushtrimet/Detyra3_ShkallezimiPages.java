package cacttus.education.ifelseswitch.ushtrimet;

import java.util.Scanner;

public class Detyra3_ShkallezimiPages {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Sa eshte paga juaj");
        int paga = reader.nextInt();

        if(paga <=0){
            System.out.println("pa page");
        }
        else if(paga<=80){
            System.out.println("social");
        }
        else if(paga > 80 && paga <120 ){
            System.out.println("Social ose pensioner");
        }
        else if(paga >120 && paga < 180){
            System.out.println("paga minimale");
        }
        else if(paga > 180 && paga <300){
            System.out.println("paga Mesatare");
        }
        else if(paga > 300 && paga <400){
            System.out.println("Paga e mire!");
        }
        else if(paga >400 && paga <600){
            System.out.println("Paga mbimesataren e mire");
        }
        else if(paga > 600){
            System.out.println("Page e larte, pse po do me nshu kosove?");
        }















    }
}
