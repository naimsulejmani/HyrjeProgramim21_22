package cacttus.education.java_arrays;

public class Letrat {
    public static void main(String[] args) {
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        String[] suits = {"♣", "♦", "♥", "♠"};
        String[] fullDeck = new String[ranks.length * suits.length];

//per cdo suit shko per secilen rank
        for (int suitIndex = 0; suitIndex < suits.length; suitIndex++) {
            for (int rankIndex = 0; rankIndex < ranks.length; rankIndex++) {
                fullDeck[suitIndex * ranks.length + rankIndex] = ranks[rankIndex] + suits[suitIndex];
                System.out.printf("%4s", fullDeck[suitIndex * ranks.length + rankIndex]);
            }
        }
    }
}
