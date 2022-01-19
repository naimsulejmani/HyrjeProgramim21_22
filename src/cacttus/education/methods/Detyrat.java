package cacttus.education.methods;

public class Detyrat {
    public static void main(String[] args) throws InterruptedException {
        // shtypAlfabetinAnglez();
        shtypAlfabetinAnglez(true);
        System.out.println();
        shtypAlfabetinAnglez(false);
    }

    public static void shtypAlfabetinAnglez() throws InterruptedException {
        char shkronja = 'a';
        while (shkronja <= 'z') {
            System.out.printf("%3s", shkronja++);
            Thread.sleep(2000);
        }
    }

    public static void shtypAlfabetinAnglez(boolean toLowerCase) {
        char shkronja = toLowerCase ? 'a' : 'A'; //ternary operator
        char shkornjaFundit = toLowerCase ? 'z' : 'Z';
        while (shkronja <= shkornjaFundit) {
            System.out.printf("%3s", shkronja++);
        }
    }
}







