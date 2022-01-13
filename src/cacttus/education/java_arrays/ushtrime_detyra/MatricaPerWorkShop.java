package cacttus.education.java_arrays.ushtrime_detyra;

import java.util.Scanner;

public class MatricaPerWorkShop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj numrin e rreshtave: ");
        int row = reader.nextInt();
        System.out.println("Shkruaj numrin e kolonave: ");
        int col = reader.nextInt();

        int[][] matrix = new int[row][col];

        //mbushja randome e matrices me vlera nga 1 deri ne 10_000;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = 1 + ((int) (Math.random() * 10000));
            }
        }

        for (var array : matrix) {
            for (int element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("Printimi i diagonales se matrices forma 1- ");
        System.out.println("---------------------------");
        //shtypja e diagonales se matrices
        for (int i = 0; i < matrix.length; i++) {//per cdo rresht
            for (int j = 0; j < matrix[i].length; j++) {//per cdo kolone
                if (i == j) {
                    System.out.printf("%5d", matrix[i][j]);
                } else System.out.printf("%5s", "");
            }
            System.out.println();
        }
        System.out.println("---------------------------");
        System.out.println("Printimi i diagonales se matrices forma 2- Lind Ramiqi ");
        System.out.println("---------------------------");
        for (int i = 0; i < matrix.length; i++) {
            System.out.printf("%5d ", matrix[i][i]);
        }

    }
}
