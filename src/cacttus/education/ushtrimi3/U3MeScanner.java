package cacttus.education.ushtrimi3;

import java.util.Scanner;

public class U3MeScanner {
    //detyra me ekipe dhe rezultate
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        System.out.print("Ekipi vendas: ");
        String homeTeam = user.nextLine();

        System.out.print("Ekipi musafir: ");
        String awayTeam = user.nextLine();

        System.out.print("Numri i tifozeve: ");
        int fansNumber = user.nextInt();

        user.nextLine();//zbrazja e buffer-it
        System.out.print("Fusha/Arena: ");
        String stadium = user.nextLine();

        System.out.printf("Sa gola ka shenuar %s: ",homeTeam);
        byte homeTeamGoals = user.nextByte();

        System.out.printf("Sa gola ka shenuar %s: ",awayTeam);
        byte awayTeamGoals = user.nextByte();
        System.out.println("----------------------------------------------");
        System.out.println("Rezultati perfundimtar");
        System.out.printf("%s - %s  %d-%d%n",homeTeam,awayTeam,homeTeamGoals,awayTeamGoals);
        System.out.printf("Stadiumi %s me gjithsej %d spektatore prezent.%n",stadium,fansNumber);
        System.out.println("----------------------------------------------");


    }
}






















