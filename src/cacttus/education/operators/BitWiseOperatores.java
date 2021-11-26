package cacttus.education.operators;

public class BitWiseOperatores {
    public static void main(String[] args) {
        System.out.println(42 & 15);
        System.out.println(42 | 15);
        System.out.println(42 ^ 15);
        System.out.println((42 & 15) * 5);
        System.out.println(4>>1);
        // 00000100 >> 00000010
        System.out.println(4<<3);
        System.out.println(~10);
    }
}
