package cacttus.education.iterations.for_loop.ushtrime;

import java.util.Scanner;

public class NumratCiftDheTek {
    public static void main(String[] args) {
        detyraMeNumratCiftDheTek();
    }

    public static void detyraMeNumratCiftDheTek() {
        Scanner user=new Scanner(System.in);
        System.out.println("Shkruani nje numer:");
        int numri=user.nextInt();
        for(int i=1;i<=numri;i++){
            if(i%2==0){
                System.out.printf("Numri %d eshte cift!%n",i);
            }
            else{
                System.out.printf("Numri %d eshte tek!%n",i);
            }
        }
    }
}



