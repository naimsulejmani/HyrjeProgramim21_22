package cacttus.education.iterations.while_loop.ushtrime;

public class WhilePrintSeries {
    public static void main(String[] args) {
        int counter = 1;


        while (counter <= 100) {
            System.out.printf("%d %10d %10d%n"
                    , counter, counter * counter,
                    counter * counter * counter);
            counter++;
        }
    }
}
