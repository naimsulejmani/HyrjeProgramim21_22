package cacttus.education.ifelseswitch.switchexamples;

import java.util.Scanner;

public class Ushtrimi1MeSwitch {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Shkruaj noten ne matematike (0-5): ");
        int nota = reader.nextInt();

        //switch punon me int, byte, char dhe String

        switch (nota) {
            case 0:
                System.out.println("Nuk jeni vlersuar per kete lende!");
                break;
            case 1:
                System.out.println("Dobet!!!!!!!");
                break;
            case 2:
                System.out.println("Mjaftueshem!!!!");
                break;
            case 3:
                System.out.println("Mire!!!!");
                break;
            case 4:
                System.out.println("Shume mire!!!!");
                break;
            case 5:
                System.out.println("Shkelqyeshem!!!!");
                break;
            default:
                System.out.printf("Ky numer %d nuk eshte pjese e notave valide!",nota);
                break;
        }





    }
}















