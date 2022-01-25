package cacttus.education.methods.detyra_provimi_aka;

public class PrimeDoranti {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }
    static boolean isPrime(int number) {
        /*
        TODO: Implement this method to check if the number is a prime number
         */
        if (number % 2 == 0) return false;
        for (int i = 3; i <= number / 2; i += 2) {
            if (number % i == 0) return false;
        }
        return true;
    }
}






