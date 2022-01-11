package cacttus.education.java_arrays.forEach;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ForEachExample {
    public static void main(String[] args) {
        int[] numbers = {6, 17, 9, 0, -1, 5, -6};
        int total = 0;

        for (int number : numbers) {
            total += number;
        }

        System.out.printf("Shuma e numrave te vargut %s eshte: %d",
                Arrays.toString(numbers), total
        );


    }
}
