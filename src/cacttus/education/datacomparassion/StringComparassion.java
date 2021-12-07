package cacttus.education.datacomparassion;

public class StringComparassion {
    public static void main(String[] args) {
        String emri1 = "ALBERT";
        String emri2 = "ALBI";
        String emri3 = "INTI";
        String emri4 = "BERAT";

        System.out.println(emri1.compareTo(emri4));
        System.out.println(emri4.compareTo(emri1));

        if(emri4.equals("BERAT")) {
            System.out.println("BERAT eshte BERAT");
        }

        if(emri4.compareTo("BERAT")==0) {
            System.out.println("BERAT ESHTE BERAT");
        }
    }
}
