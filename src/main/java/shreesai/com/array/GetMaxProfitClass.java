package shreesai.com.array;

public class GetMaxProfitClass {
    public int maxProfit(int[] prices) {
        if(prices == null) return 0;
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
}

