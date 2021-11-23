package cacttus.education.converts;

public class ConvertStringToPrimitiveTypes {
    public static void main(String[] args) {
        String number = "25";
        byte byteNumber = Byte.parseByte(number);
        System.out.println("Byte = " + byteNumber);

        number = "6567";
        short shortNumber = Short.parseShort(number);
        System.out.println("Short = " + shortNumber);

        number = "1234567";
        int intNumber = Integer.parseInt(number);
        System.out.println("Integer = " + intNumber);

        number = "9234567890";
        long longNumber = Long.parseLong(number);
        System.out.println("Long = " + longNumber);

        number = "23.45";
        float floatNumber = Float.parseFloat(number);
        System.out.println("Float = " + floatNumber);

        number = "123.455";
        double doubleNumber = Double.parseDouble(number);
        System.out.println("Double = " + doubleNumber);

        number = "dfdgdfgdfg";
        boolean areThisStudentsTheBest = Boolean.parseBoolean(number);
        System.out.println("ARE THIS STUDENTS THE BEST = " + areThisStudentsTheBest);
    }
}







