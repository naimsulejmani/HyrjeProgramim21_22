package cacttus.education.iterations.do_while;

public class NesteLoopWhile {
    public static void main(String[] args) {
        int count1 = 1;

        while (count1 <= 10) {
            int count2 = 1;
            while (count2 <= 20) {
                System.out.printf("%d - Here! %n", count2 + (count1 - 1) * 20);
                count2++;
            }
            count1++;
        }
    }
}
