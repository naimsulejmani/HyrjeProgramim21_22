package cacttus.education.iterations.for_loop.ushtrime;

import java.util.Scanner;

public class DetyraMeSeri {
    public static void main(String[] args) {
       // shtypNumratDheKatroret();
        tabelaEShumzimit();
    }

    public static void shtypNumratDheKatroret() {
        for (int i=1; i<=100;i++) {
            System.out.printf("%d %20d %n", i, i*i);
        }
    }

    public  static void tabelaEShumzimit(){
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj nje numer: ");
        int numri = reader.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.printf("%d * %d = %d %n", i, numri, i * numri);
        }
    }

}









