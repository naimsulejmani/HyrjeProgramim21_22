package cacttus.education.java_arrays.multidimensional_array;

import java.util.Scanner;

public class MbushjaEMatrixes {
    public static void main(String[] args) {
        int[][] matrix = new int[2][2];
        Scanner reader = new Scanner(System.in);
        //menaxhimi per rresht
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Shkruaj vleren per matrix[%d][%d]=", i + 1, j + 1);
                matrix[i][j] = reader.nextInt();
            }
        }
        //shtypja e matrixes me forEach
        System.out.println("Ju keni dhene matrix-en: ");
        System.out.println("---------------------------");
        for (int[] array : matrix) {
            for (int element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }

    }
}








