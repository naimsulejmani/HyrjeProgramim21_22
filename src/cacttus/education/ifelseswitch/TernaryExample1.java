package cacttus.education.ifelseswitch;

import javax.swing.*;

public class TernaryExample1 {
    //eshte me gjet nje numer a eshte tek apo cift odd or even
    public static void main(String[] args) {
        String vlera = JOptionPane.showInputDialog("Shkruaj nje numer: ");
        System.out.println("Numri i perzgjedhur eshte: " + vlera);
        int numri = Integer.parseInt(vlera);
        //shtesa e pyetjes se Drin Hasanit :)
//        int numriTjeter = Integer.parseInt(
//                JOptionPane.showInputDialog("Shkruaj nje numer tjeter:")
//        );
//
//        System.out.println("Numri tjeter eshte "+numriTjeter);
        String cfareNumriEshte;
//kur plotpjestojme me dy dhe mbetja a eshte e barabarte me zero
        if (numri % 2 == 0) {
            cfareNumriEshte = "EVEN";
        } else {
            cfareNumriEshte = "ODD";
        }

        String ckaEshte = numri % 2 == 0 ? "EVEN" : "ODD";

        System.out.println("Numri eshte: " + cfareNumriEshte);
        JOptionPane.showMessageDialog(null,"Numri eshte: "+ckaEshte);
    }
}












