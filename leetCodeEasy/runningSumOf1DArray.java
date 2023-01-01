class Solution {
    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] newArray = new int[len];
        int runningTotal = 0;
        for(int i = 0; i < len; i++) {
            runningTotal += nums[i];
             newArray[i] = runningTotal;
        }
        return newArray;
    }
}