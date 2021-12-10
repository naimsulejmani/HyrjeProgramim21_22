package cacttus.education.ifelseswitch.switchexamples;

import java.util.Scanner;

public class ProgrnozaSportive {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruani ekipin vendas");
        String homeTeam = reader.nextLine();
        System.out.println("Shkruani ekipin musafir");
        String awayTeam = reader.nextLine();
        System.out.println("Shkruaj prognozen e juaj(1 per fitore te ekipit vendas" +
                ", 2 per fitore te ekipit musafir" +
                ", X per barazim");
        String prognoza = reader.nextLine();
        switch (prognoza){
            case "1":
                System.out.printf("Prognoza ime per ndeshjen %s vs %s eshte se do te fitoje %s",
                        homeTeam, awayTeam, homeTeam);
                break;
            case "2":
                System.out.printf("Prognoza ime per ndeshjen %s vs %s eshte se do te fitoje %s",
                        homeTeam, awayTeam, awayTeam);
                break;
            case "X":
                System.out.printf("Prognoza ime per ndeshjen %s vs %s eshte se do te mbesin baraz",
                        homeTeam, awayTeam);
                break;
            default:
                System.out.println("Nuk keni dhene prognoze adekuate!!!!!!");
                break;



        }















    }
}
