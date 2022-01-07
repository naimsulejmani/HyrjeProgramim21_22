package cacttus.education.java_arrays;

public class Letrat {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] fullDeck = new String[ranks.length * suits.length];

        int fullDeckIndex = 0;

//per cdo suit shko per secilen rank
        for (int rankIndex = 0; rankIndex < ranks.length; rankIndex++) {
            for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {

                //fullDeck[suitIndex * ranks.length + rankIndex] = ranks[rankIndex] + suits[suitIndex];
                //System.out.printf("%4s", fullDeck[suitIndex * ranks.length + rankIndex]);
                fullDeck[fullDeckIndex++] = ranks[rankIndex] + suits[suitIndex];
            }
        }

        for (int i = 0; i < fullDeck.length; i++) {
            System.out.printf("%5s", fullDeck[i]);
        }


    }
}
