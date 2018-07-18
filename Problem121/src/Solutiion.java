public class Solutiion {
    public int maxProfit(int[] prices) {
        int profit = 0;
        if (prices.length < 2)
            return profit;
        int buy=prices[0];
        for (int price:prices){
            if (price>buy){
                profit=Math.max(profit,price-buy);
            }else buy=Math.min(buy,price);
        }
        return profit;
    }
}
