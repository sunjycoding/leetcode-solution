package day051_day100.day100;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

/**
 * 950. Reveal Cards In Increasing Order
 *
 * @author created by sunjy on 4/9/24
 */
public class RevealCardsInIncreasingOrder {

    public static int[] deckRevealedIncreasing(int[] deck) {
        Arrays.sort(deck);
        Deque<Integer> deque = new LinkedList<>();
        for (int i = deck.length - 1; i >= 0; i--) {
            if (!deque.isEmpty()) {
                deque.addFirst(deque.removeLast());
            }
            deque.addFirst(deck[i]);
        }
        int[] result = new int[deck.length];
        int i = 0;
        for (int card : deque) {
            result[i++] = card;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] deck = new int[]{17, 13, 11, 2, 3, 5, 7};
        System.out.println(Arrays.toString(deckRevealedIncreasing(deck)));
    }

}
