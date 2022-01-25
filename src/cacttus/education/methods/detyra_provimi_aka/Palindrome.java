package cacttus.education.methods.detyra_provimi_aka;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(3443));
        System.out.println(isPalindrome(5));
        System.out.println(isPalindrome(123));
    }

    static boolean isPalindrome(String text) {
        for (int i = 0, j = text.length() - 1; i <= j; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) return false;
        }
        return true;
    }

    static boolean isPalindrome(int number) {
        //123 -> 321 pastaj krahaso 123==321
        String text = String.valueOf(number);
        // "" + number;  Integer.toString(number);
        String reversedText = "";

        for (int i = 0; i < text.length(); i++) {
            reversedText = text.charAt(i) + reversedText;
        }
        return text.equals(reversedText);
    }
}



