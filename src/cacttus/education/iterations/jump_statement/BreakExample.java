package cacttus.education.iterations.jump_statement;

public class BreakExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            if (i == 3)
                continue;

            System.out.println(i);
        }
    }
}
