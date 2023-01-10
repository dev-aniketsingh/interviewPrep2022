class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int len = accounts[0].length; 
        for(int i = 0; i < accounts.length; i++) {
            int currentSum = 0;
            for(int j = 0; j < len; j++) {
                currentSum += accounts[i][j];
            }
            max = Math.max(currentSum,max);
        }
        return max;
    }
}