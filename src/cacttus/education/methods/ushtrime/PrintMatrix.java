package cacttus.education.methods.ushtrime;

public class PrintMatrix {
    public static void main(String[] args) {
        int matrix[][] = {
                {1, 3},
                {2, 4}
        };
        printArray2D(matrix);
    }

    static void printArray2D(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}
