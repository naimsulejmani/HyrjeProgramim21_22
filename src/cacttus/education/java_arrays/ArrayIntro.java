package cacttus.education.java_arrays;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        //deklarimi i vargut
        int[] notat;//nuk e dijme
        int[] numrat = new int[10];//deklare and create reserve array

        notat = new int[200000];
        double[] pagat = new double[200_000_000];

        Scanner reader = new Scanner(System.in);
        reader.nextLine();

        String[] emrat = {"Dorant", "Fitore", "Albin"};
        String[] mbiemrat;
        mbiemrat = new String[]{"Sedikushi", "Sedikushja", "Hetemi"};

        String[] lendet = new String[4];
        lendet[0] = "Hyrje ne programim";
        lendet[1] = "Programimi i orientuar ne objekte";
        lendet[2] = "Algoritmet dhe struktura e te dhenave";
        lendet[3] = "Inxhinieria Softuerike";


        System.out.println(emrat[0]);
        System.out.println(mbiemrat[0]);

        mbiemrat[0] = "Rexhepi";
        System.out.println(mbiemrat[0]);
        pagat[100 + 300 * 2 - 23] = 1_000;

        //qasja ne element te vargut ne menyre randome
        //prej 0 deri ne gjatesine e vargut -1;
        pagat[(int) (Math.random() * pagat.length)] = 300;

        int indeksi = 100;
        pagat[indeksi] = 1000;

    }


}
