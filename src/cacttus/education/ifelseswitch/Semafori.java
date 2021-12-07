package cacttus.education.ifelseswitch;

import java.util.Scanner;

public class Semafori {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruani numrin prej 1 deri 4: ");
        int semafori = reader.nextInt();
        if(semafori == 1){
            System.out.println("Semafori eshte i kuq");
        }else if (semafori == 2){
            System.out.println("Semafori eshte i verdhe");
        }else if(semafori == 3){
            System.out.println("Semafori eshte i gjelber");
        }else if (semafori == 4){
            System.out.println("Semafori eshte duke blinkuar!");
        }else{
            System.out.println("Semafori nuk punon!");
        }
    }
}