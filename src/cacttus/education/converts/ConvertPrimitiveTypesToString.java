package cacttus.education.converts;

public class ConvertPrimitiveTypesToString {
    public static void main(String[] args) {
        //String number = 10;
        int no = 1;
        //String otherNumber = no;

        String number = String.valueOf(10);
        number = String.valueOf(25.56f);
        number = String.valueOf(true);
        number = String.valueOf(no);

        number = "" + 10;
        number = "" + 25.65f;
        number = true + "";
        number = no + "";


    }
}
