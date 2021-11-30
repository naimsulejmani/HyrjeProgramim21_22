package cacttus.education.ifelseswitch;

public class IfElseExample {
    public static void main(String[] args) {
        int age = 116;
        if(age>=18) {
            System.out.println("You can enter on the club!");
        }
        else {
            System.out.println("Sorry!");
        }

        if(age<18)
            System.out.println("Sorry");
        else
            System.out.println("You can enter on this club!");

        System.out.println("This will execute always!");

    }
}
