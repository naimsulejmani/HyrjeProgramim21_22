package cacttus.education.ifelseswitch;

import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Programi i cili gjen numrin me te madh nga 3 numrat e dhene!");
        System.out.println("Shkruani numrin e pare: ");
        int n1 = reader.nextInt();
        System.out.println("Shkruani numrin e dyte: ");
        int n2 = reader.nextInt();
        System.out.println("Shkruani numrin e trete: ");
        int n3 = reader.nextInt();
        int largestNumber;
        //nese numri 1 eshte m i madhe se numri 3 atehere shiko krahaso
        // numrin dy me numrin e mbetur
        if (n1 > n3) {
            if (n1 > n2)
                largestNumber = n1;
            else
                largestNumber = n2;
        } else {
            if(n3>n2)
                largestNumber=n3;
            else
                largestNumber=n2;
        }

        System.out.println("Numri me i madh eshte: "+largestNumber);
    }
}










