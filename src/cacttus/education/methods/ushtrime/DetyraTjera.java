package cacttus.education.methods.ushtrime;

public class DetyraTjera {
    public static void main(String[] args) {
        System.out.println(divide(5_000_000_000l, 2_000_000_000l));
        System.out.println(sign(-10));
        System.out.println(sign(10));
        System.out.println(sign(0));
        System.out.println("MAX 3 numra = " + getNumberOfMaxParam(10, 20, 15));
        System.out.println(getNumberOfMaxParam(12, 3, 12));
        System.out.println(sumInRange(5, 5));
        System.out.println(sumInRange(1, 5));
    }

    static int getNumberOfMaxParam(int n1, int n2, int n3) {
        if (n1 >= n2) {
            if (n1 >= n3) return 1;
            else return 3;
        } else {
            if (n2 >= n3) return 2;
            else return 3;
        }
    }

    static double divide(long number1, long number2) {
        return (double) number1 / number2;
    }

    static int sign(int numri) {
        if (numri > 0) {
            return 1;
        } else if (numri == 0) {
            return 0;
        } else {
            return -1;
        }
    }

    static int sumInRange(int from, int to) {
        int sum = 0;
        for (int i = from; i < to; i++) {
            sum += i;
        }
        return sum;
    }

    static long sumInRange(long from, long to) {
        long sum = 0;
        while (from < to) {
            sum += from++;
        }
        return sum;
    }
}












