package cacttus.education.java_arrays.ushtrime_detyra;

public class ShumezimiIMatricave {
    public static void main(String[] args) {
        int[][] m1 = {
                {1, 2, 3}, {2, 3, 4}, {4, 5, 6}
        };
        int[][] m2 = {{6, 5, 4}, {2, 2, 2}, {0, 1, 2}};

        int[][] m3 = new int[3][3];

        //shko per secilin rresht te matrices C
        for (int row = 0; row < m3.length; row++) {
            //shko per secilin kolone te rreshtit te matrices C
            for (int col = 0; col < m3[row].length; col++) {
                //
                for (int step = 0; step < m3.length; step++) {
                    m3[row][col] += m1[row][step] * m2[step][col];
                }
            }
        }
        for (var array : m3) {
            for (var element : array) {
                System.out.printf("%5d", element);
            }
            System.out.println();
        }


    }
}
