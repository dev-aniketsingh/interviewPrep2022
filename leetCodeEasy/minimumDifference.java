class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(k == 1) 
            return 0;
       Arrays.sort(nums);
        int l = 0;
        int r = k-1;
        int result = Integer.MAX_VALUE;
        while(r < nums.length) {
            result = Math.min(result, nums[r++] - nums[l++]);
        }
        
        return result;
    }
}