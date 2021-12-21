package cacttus.education.iterations.while_loop;

import java.util.Scanner;

public class SentinelUshtrime {
    //programi per me i llogarite mesataren e numrave te marre nga shfrytezuesi deri
    //sa nuk e jep zero
    public static void main(String[] args) {
        int num, sum = 0, count = 0;
        Scanner reader = new Scanner(System.in);
        double avg;
        System.out.println("Enter an integer (0 to quit): ");
        num = reader.nextInt();

        //perderisa variabla num eshte e ndryshme prej zeros (perserite hapat vijues)
        while (num != 0) {
            count++; //u gjet nje numer i ndryshem prej zeros
            sum += num; // shtoja vleren e shfrytezit tek shuma
            System.out.println("Enter an integer (0 to quit): ");
            num = reader.nextInt();
        }

        avg = (double) sum / count;
        System.out.printf("Mesatarja e %d numrave te shfrytezuesit eshte: %.2f", count, avg);

    }
}






