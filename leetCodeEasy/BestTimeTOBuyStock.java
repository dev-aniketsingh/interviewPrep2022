class Solution {
    public int maxProfit(int[] prices) {
        int left = 0, right = 1;
        int maxprofit = 0;
        while(right < prices.length) {
            if(prices[left] < prices[right]){
                maxprofit = Math.max(maxprofit,prices[right] - prices[left]);
                right++;
            }
            else {
                left = right;
                right++;
            }
        }
        return maxprofit;
    }
}