package cacttus.education.ifelseswitch.switchexamples;

public class Ushtrimi2MeSwitch {
    public static void main(String[] args) {
        char shkronja = 'A';

        switch (shkronja) {
            case 'a':
            case 'A':
                System.out.println("Shkronja e pare e alfabetit");
                break;
            case 'b','B':
                System.out.println("Shkronja e dyte e alfabetit");
                break;
            default:
                System.out.println("Shkronja tjera!");
                break;

        }



    }
}













