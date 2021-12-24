package cacttus.education.iterations.while_loop.ushtrime;

public class WhileShumaNumrave {
    public static void main(String[] args) {
        int counter = 1;
        int sum = 0;

        while (counter <= 100) {
            sum += counter++;
            /*
                sum = sum + counter;
                counter = counter + 1; // counter++;
             */
        }
        System.out.printf("Shuma eshte %d", sum);
    }
}
