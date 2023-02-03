class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int len = nums.length;
        int count;
        int[] nnums = new int[len];
        for(int i = 0; i < len; i++) {
            count = 0;
            for(int j = 0; j < len; j++) {
                if(nums[j] < nums[i] && i!=j ) {
                    count++;
                }
                nnums[i] = count;
            }
        }

        return nnums;
    }
}