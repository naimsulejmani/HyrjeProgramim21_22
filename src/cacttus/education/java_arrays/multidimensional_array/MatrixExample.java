package cacttus.education.java_arrays.multidimensional_array;

public class MatrixExample {
    public static void main(String[] args) {
        //matrixa me 3 rreshta dhe 4 kolona
        // vargu me 3 elemente ku secili element eshte varg me 4 elemente tjera
        int[][] matrix1 = new int[3][4];
        int row = 2;
        int col = 2;

        double[][] matrix2 = new double[row][col];
        //menyra me array initializer (matrix initializer)
        int[][] matrix3 = {
                {1, 2, 3},
                {2, 2, 6},
                {9, -6, -7}
        };
        //pjesa kur shkojme rresht per rresht
        for (int i = 0; i < matrix3.length; i++) {
            //pjesa kur shkojme kolone per kolone
            for (int j = 0; j < matrix3[i].length; j++) {
                System.out.printf(" %5d", matrix3[i][j]);
            }
            System.out.println();
        }
        System.out.println("SHtypja e matrixes (array2d) me forEach");
        //     int[][] matrix3
        //per cdo varg te vargut
        //per cdo rresht te matrixces
        for (int[] array : matrix3) {
            for (int element : array) {
                System.out.printf(" %5d", element);
            }
            System.out.println();
        }
    }
}





