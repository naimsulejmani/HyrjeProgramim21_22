package cacttus.education.methods.detyra_provimi_aka;

public class ShumaNumrave {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1234));
        System.out.println(sumOfDigits(5));
        System.out.println(sumOfDigits(91231983));
    }

    static int sumOfDigits(int number) {
        int shuma = 0;
        while (number > 0) {
            int lastDigit = number % 10;//merre shifren e fundit
            shuma += lastDigit; // shifren e fundit shtoja shumes
            number /= 10; //pjesto numrin me dhjete shko tek numri i rradhes
        }
        return shuma;
    }
}
