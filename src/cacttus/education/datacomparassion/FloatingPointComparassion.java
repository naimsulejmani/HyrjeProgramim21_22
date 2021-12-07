package cacttus.education.datacomparassion;

public class FloatingPointComparassion {
    public static void main(String[] args) {
        final double TOLERANCE = 0.00000001;
        double number = 1.0;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        number -= 0.1;
        System.out.println(number);
        if(number==0) {
            System.out.println("Jane te barabarte!");
        }
        if(Math.abs(number)<TOLERANCE) {
            System.out.println("Numrat trajtoj si te barabarte!");
        }

    }
}





