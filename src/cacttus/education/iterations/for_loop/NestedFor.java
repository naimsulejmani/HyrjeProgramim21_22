package cacttus.education.iterations.for_loop;

public class NestedFor {
    public static void main(String[] args) {

        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.printf("%d %d %n", i, j);
            }
        }

    }
}
