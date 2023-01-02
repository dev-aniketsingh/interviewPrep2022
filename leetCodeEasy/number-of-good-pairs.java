class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int len = nums.length;
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < len; j++) {
                if(nums[i] == nums[j] && i != j) 
                    count++;
            }
        }
        return count/2;
    }
}