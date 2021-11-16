package cacttus.education.detyrat;

import java.util.Scanner;

public class D2_AlbinHetemi {
    public static void main(String[] args) {

        System.out.println("Shkruani emrin tuaj: ");
        Scanner reader = new Scanner(System.in);
        String emriIPerdoruesit = reader.next();


        System.out.println("Shkruani mbiemrin tuaj: ");
        String mbiemriIPerdoruesit = reader.nextLine();

        reader.nextLine();

        System.out.println("Sa vjeqar jeni: ");
        int moshaEPerdoruesit= reader.nextInt();

        System.out.println("Ne cilin vit keni perfunduar shkollen e mesme: ");
        int shkollaEPerdoruesit=reader.nextInt();

        System.out.println("Ne cilin vit ndodhemi tani:");
        float vitiAktual=reader.nextFloat();


        System.out.println("A preferoni te luani PlayStation (true/false) ");
        boolean playStation= reader.nextBoolean();

        System.out.println("Sa here ne dite luani Playstation ");
        float lojaPlay = reader.nextFloat();

        System.out.println("A e luani lojen  Blur ne playstation (true/false)");
        boolean aLuaniBlur = reader.nextBoolean();

        System.out.println("A e luani lojen Fifa 2021 ne playstation (true/false)");
        boolean aLuaniFifa = reader.nextBoolean();

        System.out.println("Sa ore ne dite luani Blur ne PlayStation");
        byte oretEBlurit= reader.nextByte();

        System.out.println("Sa ore ne dite luani Fifa 2021");
        byte oretFifa2021 = reader.nextByte();

        System.out.println("Sa minuta zgjat nje loje ne Blur");
        long lojaNeBlur = reader.nextLong();

        System.out.println("Sa minuta zgjat nje Loje ne Fifa 2021");
        long lojaneFifa2021 = reader.nextLong();

        System.out.println("Ciles seri(te shkruhet me numer rendor) i takon PlayStation aktual");
        short playStationAktual= reader.nextShort();


        System.out.println("Me sa joysticks mund te luhet ne PlayStation 5");
        short joysticks = reader.nextShort();

        System.out.println("Sipas mendimit tuaj sa ekipe futbollistike permban Fifa 2021");
        double ekipeFutbolli = reader.nextDouble();

        System.out.println("Sa lojtare permban Fifa 2021");
        double lojtare = reader.nextDouble();


        System.out.println("Me cilen shkronje te Joystickut mund te pasoni ne Fifa 2021");
        char pasimi = reader.next().charAt(0);

        System.out.println("Me cilen shkronje te Joystickut mund te gjuani ne porte ne Fifa 2021");
        char gjuajtje = reader.next().charAt(0);

        System.out.println("Qfare mendimi keni per Play Station 5");
        String mendimi=reader.nextLine();

        reader.nextLine();

        System.out.println("A ju pelqen te luani vetem apo me shoke");
        String menyra=reader.nextLine();


        System.out.println("---------------------------------------------------------------------------------");

        System.out.println("Emri juaj eshte " +emriIPerdoruesit);

        System.out.println("Mbiemri juaj eshte " +mbiemriIPerdoruesit);

        System.out.println("Ju jeni " +moshaEPerdoruesit+ " vjeqar");

        System.out.println("Ju keni perfunduar shkollen e mesme ne vitin " +shkollaEPerdoruesit);

        System.out.println("Ne ndodhemi ne vitin "+vitiAktual);

        System.out.println("Ju keni zgjedhur " +playStation);

        System.out.println("Ju luani "+lojaPlay+" here ne dite");

        System.out.println("Ju keni zgjedhur "+aLuaniBlur);

        System.out.println("Ju keni zgjedhur "+aLuaniFifa);

        System.out.println("Ju keni thene se ju luani "+oretEBlurit+ "ore ne dite lojen Blur");

        System.out.println("Ju keni thene se ju luani "+oretFifa2021+ "ore ne dite lojen Fifa 2021");

        System.out.println("Ju keni thene se nje loje ne Blur zgjat "+lojaNeBlur+ "minuta");

        System.out.println("Ju keni thene se nje loje ne Fifa 2021 zgjat "+lojaneFifa2021+ " minuta");

        System.out.println("Ju keni thene se Play Station aktual i takon serise se "+playStationAktual);

        System.out.println("Ju keni thene se ne playstation mund te luhet me "+joysticks+ " joysticksa");

        System.out.println("Sipas mendimit tuaj nje Fifa 2021 permban " +ekipeFutbolli+ " ekipe futbollistike");

        System.out.println("Sipas mendimit tuaj Fifa 2021 permban " +lojtare+ " lojtare");

        System.out.println("Ju keni thene se me shkronjen " +pasimi+ " te joystickut mund te pasohet topi");

        System.out.println("Ju keni thene se me shkronjen " +gjuajtje+ " te joystickut mund te gjuajme ne porte");

        System.out.println("Mendimi juaj per Playstation eshte " +mendimi);

        System.out.println("Juve ju pelqen qe playstation te luani " +menyra);









    }
}
