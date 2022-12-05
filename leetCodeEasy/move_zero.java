class Solution {
    public void moveZeroes(int[] nums) {
        int fast = 0, slow = 0;
        
        while(fast < nums.length) {
            if(nums[fast] != 0) {
                int temp = nums[slow];
                nums[fast] = temp;
                slow++;
            }
            fast++;
        }
    }
}