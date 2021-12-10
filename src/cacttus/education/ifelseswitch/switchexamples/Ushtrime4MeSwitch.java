package cacttus.education.ifelseswitch.switchexamples;

public class Ushtrime4MeSwitch {
    public static void main(String[] args) {
        String menu = "Dashboard";

        switch (menu) {
            case "Admin" -> System.out.println("Menyja e administratorit!");
            case "Dashboard"-> System.out.println("Faqja fillestare");
            case "Manager" -> System.out.println("Menyja e menaxherave");
            default -> System.out.println("Nuk keni zgjedhur meny te duhur!");
        }
    }
}
