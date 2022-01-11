package cacttus.education.java_arrays.multidimensional_array;

public class Detyre {
    public static void main(String[] args) {
        int[][][] array3d =
                {
                        {
                                {1, 2, 3},
                                {2, 3, 4},
                        },
                        {
                                {3, 3, 3},
                                {4, 4, 4}
                        }
                };

        for (int[][] array2d : array3d) {
            for (int[] array : array2d) {
                for (int element : array) {
                    System.out.printf("%5d ", element);
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
