class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int len = prices.length;
        for(int i = 1; i < len; i++) {
            if(prices[i-1] < prices[i])
                profit += prices[i] -prices[i-1];
        }
        return profit;
    }
}