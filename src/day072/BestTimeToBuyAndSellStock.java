package day072;

/**
 * 121. Best Time to Buy and Sell Stock
 *
 * @author created by sunjy on 3/12/24
 */
public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {
        if (prices == null || prices.length <= 1) {
            return 0;
        }

        // Initialize minPrice to the first price
        int minPrice = prices[0];
        // Initialize maxProfit to 0
        int maxProfit = 0;

        // Loop through all prices starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // Update minPrice if the current price is lower than the minPrice
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else {
                // If selling today is better (current price - minPrice is greater than maxProfit)
                // then update maxProfit
                maxProfit = Math.max(maxProfit, prices[i] - minPrice);
            }
        }

        return maxProfit;
    }

}
