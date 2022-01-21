package cacttus.education.methods.workshop;


import java.util.Arrays;
import java.util.Scanner;

public class FederataEJudos {
    public static void main(String[] args) {
        String[] judistat = generateArray("judistin");
        String[] turnet = generateArray("turneun");

        printArray(judistat);
        printArray(turnet);

        int[][] rezultatet = new int[judistat.length][turnet.length];
        mbushMatricen(rezultatet, 0, 10);
        printMatrix(rezultatet);
        detyraA(rezultatet, judistat);
        detyraB(rezultatet, judistat);

    }

    public static void detyraB(int[][] rezultatet, String[] judistat) {
        for (int row = 0; row < rezultatet.length; row++) {
            int counter1 = numroElementinNeVarg(rezultatet[row], 1);
            int counter2 = numroElementinNeVarg(rezultatet[row], 2);
            int counter3 = numroElementinNeVarg(rezultatet[row], 3);
            System.out.println("------------------------");
            System.out.printf("%s %n", judistat[row]);
            System.out.printf("Vendi i pare: %d%n", counter1);
            System.out.printf("Vendi i dyte: %d%n", counter2);
            System.out.printf("Vendi i trete: %d%n", counter3);
            System.out.println("------------------------");

        }
    }

    public static void detyraA(int[][] rezultatet, String[] judistat) {
        int minIndex = 0;//ndrone ne maxIndex
        int max = numroElementinNeVarg(rezultatet[minIndex], 1);
        for (int row = 1; row < rezultatet.length; row++) {
            int saVende = numroElementinNeVarg(rezultatet[row], 1);
            if (saVende > max) {
                max = saVende;
                minIndex = row;
            }
        }
        //if ne rast se max eshte zero duhet te shfaqet se ska judista!
        System.out.printf("Judista me turne me shume te fituara eshte: %s%n",
                judistat[minIndex]);
    }

    public static int numroElementinNeVarg(int[] array, int element) {
        int counter = 0;
        for (int numer : array) {
            if (numer == element)
                counter++;
        }
        return counter;
    }

    public static void printMatrix(int[][] array2D) {
        for (int[] array : array2D) {
            for (int element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
    }

    public static void mbushMatricen(int[][] matrix, int min, int max) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = min + (int) (Math.random() * (max + 1));
            }
        }
    }

    private static String[] generateArray(String tipi) {
        Scanner reader = new Scanner(System.in);
        System.out.printf("Sa (%s): ", tipi);
        int numri = reader.nextInt();

        String[] array = new String[numri];
        reader.nextLine();
        for (int i = 0; i < numri; i++) {
            System.out.printf("Shkruaj %s e %d: ", tipi, i + 1);
            array[i] = reader.nextLine();
        }

        return array;
    }

    public static void printArray(String[] array) {
        System.out.println(Arrays.toString(array));
    }


}






