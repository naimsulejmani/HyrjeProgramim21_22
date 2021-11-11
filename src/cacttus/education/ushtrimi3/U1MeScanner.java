package cacttus.education.ushtrimi3;


import java.util.Scanner;

public class U1MeScanner {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Is active job (true/false): ");
        boolean isActive = reader.nextBoolean();
        System.out.println("You have selected: " + isActive);

        System.out.println("Cili eshte muaji aktual (1-12): ");
        byte month = reader.nextByte();
        System.out.println("Muaji aktual eshte: " + month);

        System.out.println("Cili eshte viti aktual: ");
        short year = reader.nextShort();
        System.out.println("Viti aktual eshte: " + year);

        System.out.println("Sa njerez kane vdekur gjate luftes se dyte boterore?");
        int peopleDied = reader.nextInt();
        System.out.println("Gjate luftes kane vdekur " + peopleDied + " nejrez");

        System.out.println("Sa shiba coin jane ne treg: ");
        long shibaCoin = reader.nextLong();
        System.out.println("Ne treg jane " + shibaCoin + " shiba coin!");

        System.out.println("Sa eshte paga e kryeministrit tu Kosoves?");
        float salary = reader.nextFloat();
        System.out.println("Paga e kryeministrit eshte " + salary + " EUR.");

        System.out.println("Shkruaj sa eshte masa e diellit!?");
        double sunMass = reader.nextDouble();
        System.out.println("Masa e diellit eshte " + sunMass);


        //pas numrit kur deshirojme me lexu string (text) atehere duhet
        reader.nextLine();

        System.out.println("Shkruani emailin e juaj:");
        String email = reader.nextLine();
        System.out.println("Emal me at " + email);

        System.out.println("Shkruane emrin e plote");
        String fullName = reader.next();
        System.out.println("Emri i plote nuk eshte: " + fullName);

        reader.nextLine();

        System.out.println("Cila eshte shkronja e 10te e alfabetit anglez?");
        char shkronja10 = reader.next().charAt(0);
        System.out.println("Shkronja e 10-te e alfabetit anglez eshte: "+shkronja10);
    }
}










