package day051_day100.day099;

/**
 * 2073. Time Needed to Buy Tickets
 *
 * @author created by sunjy on 4/8/24
 */
public class TimeNeededToBuyTickets {

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while (tickets[k] != 0) {
            for (int i = 0; i < tickets.length; i++) {
                if (tickets[i] > 0) {
                    tickets[i] = tickets[i] - 1;
                    count++;
                    if (i == k && tickets[i] == 0) {
                        return count;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] tickets = new int[]{5, 1, 1, 1};
        int k = 0;
        System.out.println(timeRequiredToBuy(tickets, k));
    }

}
