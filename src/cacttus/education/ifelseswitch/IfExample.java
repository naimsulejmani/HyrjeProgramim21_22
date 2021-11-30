package cacttus.education.ifelseswitch;

public class IfExample {
    public static void main(String[] args) {
        int age = 67;
        //brenda kllapava duhet me krahasu dicka vlera qe duhet me qene eshte vetem booleane - true /false
        if (age >= 18) {
            System.out.println("You can enter on disco club!");
        }

        if (age >= 65) {
            System.out.println("Penzion te mbare!");
        }

        System.out.println("This command everytime will execute!");
    }
}
