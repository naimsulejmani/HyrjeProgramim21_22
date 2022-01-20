package cacttus.education.methods.ushtrime;

public class FaktorieliNumrit {
    public static void main(String[] args) {
        long f = faktoriel(10);
        System.out.println(f);
        System.out.println(faktoriel(11));
    }
    static long faktoriel(long number) {
        int faktoriel = 1;
        for (int i = 1; i <= number; i++) {
            faktoriel *= i;
        }
        return faktoriel;
    }
    static long factorial(int number) {
        int fact = 1;
        while (number >= 1) {
            fact *= number--;
        }
        return fact;
    }
}