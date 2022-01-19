package cacttus.education.methods;

import java.util.Scanner;

public class BasicMethod {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        shtype(10);
        shtype(20);
        shtype(100);
        BasicMethod bm = new BasicMethod();
        bm.shtype("HELLO PROGRAMERA!!!!!");
        BasicMethod.shtype(-1123);

        int shuma = sum(100, 200);
        System.out.println(shuma);
        System.out.println(sum(500, -1000));

        int numri = lexoNumerTePlote();
        System.out.println("Numri = " + numri);

        System.out.println(getRandomNumber(10_000));
        System.out.println(getRandomNumber(500d));
    }

    private static void shtype(int numri) {
        System.out.println(numri);
    }

    public void shtype(String text) {
        System.out.println(text);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int lexoNumerTePlote() {
        Scanner reader = new Scanner(System.in);
        return reader.nextInt();
    }

    public static int getRandomNumber(int numriPlote) {
        return (int) (Math.random() * numriPlote);
    }

    public static int getRandomNumber(double numriDouble) {
        return (int) (Math.random() * numriDouble);
    }
}






