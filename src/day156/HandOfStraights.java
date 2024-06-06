package day156;

import java.util.TreeMap;

/**
 * 846. Hand of Straights
 *
 * @author created by sunjy on 6/5/24
 */
public class HandOfStraights {

    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0) {
            return false;
        }

        TreeMap<Integer, Integer> cardCounts = new TreeMap<>();
        for (int card : hand) {
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        for (int card : cardCounts.keySet()) {
            if (cardCounts.get(card) > 0) {
                int count = cardCounts.get(card);

                for (int j = 0; j < groupSize; j++) {
                    int currentCard = card + j;
                    if (cardCounts.getOrDefault(currentCard, 0) < count) {
                        return false;
                    }
                    cardCounts.put(currentCard, cardCounts.get(currentCard) - count);
                }
            }
        }

        return true;
    }

}
