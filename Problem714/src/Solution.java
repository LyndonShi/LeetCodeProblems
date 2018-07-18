public class Solution {
    public int maxProfit(int[] prices, int fee) {
        if (prices.length < 2) return 0;
        int buy = -prices[0];
        int profit = 0;
        for (int i = 1; i < prices.length; i++) {
            buy = Math.max(buy, profit - prices[i]);
            profit = Math.max(buy + prices[i] - fee, profit);
        }
        return profit;
    }
}
