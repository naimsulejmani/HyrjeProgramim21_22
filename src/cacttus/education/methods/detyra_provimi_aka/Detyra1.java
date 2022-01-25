package cacttus.education.methods.detyra_provimi_aka;

public class Detyra1 {
    public static void main(String[] args) {
        System.out.println(getTotal(100, 200));
        System.out.println(isEven(13));
    }

    // emri i metodes - getTotal
    // tipi kthyes -> int
    // argumentet apo parametrat (int n1, int 2)
    static int getTotal(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    static boolean isEven(int number) {
        return number % 2 == 0;
    }

    static boolean isEven(double number) {
        if (number % 2 == 0) return true;
        else return false;
    }


}




