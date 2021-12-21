package cacttus.education.iterations.while_loop;

public class Ushtrimi1 {
    public static void main(String[] args) throws InterruptedException {
        int counter = 1;

        while (counter <= 10) {
            System.out.println(counter);
            counter++;
            Thread.sleep(1000);
        }
    }
}
