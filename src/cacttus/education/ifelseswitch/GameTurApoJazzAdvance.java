package cacttus.education.ifelseswitch;

import javax.swing.*;

public class GameTurApoJazzAdvance {
    public static void main(String[] args) {
        String qello = JOptionPane.showInputDialog("TUR apo JAZZ: ");
        boolean isTur = Math.random() < 0.5;

        String rezultati = isTur ? "TUR" : "JAZZ";

        JOptionPane.showMessageDialog(null,
                rezultati.equals(qello) ? "Ja keni QELLUAR" : "HUMBET! Fat herave tjera!"
                );


    }
}
