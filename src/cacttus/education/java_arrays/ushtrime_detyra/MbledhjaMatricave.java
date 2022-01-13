package cacttus.education.java_arrays.ushtrime_detyra;

public class MbledhjaMatricave {
    public static void main(String[] args) {
        int[][] matA = {
                {4, 5},
                {-1, 3}
        };
        int[][] matB = new int[2][2];
        matB[0][0] = -3;
        matB[0][1] = 0;
        matB[1][0] = 9;
        matB[1][1] = -5;

        int[][] matC = new int[2][2];

        //mbledhja manuale apo ma primitive :)
        matC[0][0] = matA[0][0] + matB[0][0];
        matC[0][1] = matA[0][1] + matB[0][1];
        matC[1][0] = matA[1][0] + matB[1][0];
        matC[1][1] = matA[1][1] + matB[1][1];

        var test = "Naim";
        for (var array : matC) {
            for (var element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }

        for (int row = 0; row < matC.length; row++) {
            for (int col = 0; col < matC[row].length; col++) {
                matC[row][col] = matA[row][col] + matB[row][col];
            }
        }


    }
}




