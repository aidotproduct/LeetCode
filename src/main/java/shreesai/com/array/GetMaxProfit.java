package shreesai.com.array;

public class GetMaxProfit {

    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 1; i < prices.length ; i++) {
            int todayIndex = i - 1;
            int dayWiseProfit = 0;
            while( i != prices.length && prices[i] - prices[todayIndex] > dayWiseProfit)
            {
                dayWiseProfit = prices[i] - prices[todayIndex];
                i++;
            }
            profit = profit + dayWiseProfit;
        }
        return profit;
    }

    public int maxProfit(int[] prices, boolean a) {
        int curr_profit = 0, profit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1] && i < prices.length) {
                profit += prices[i] - prices[i - 1];
            }
        }
        return profit;
    }
}
