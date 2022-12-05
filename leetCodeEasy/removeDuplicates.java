class Solution {
    public int removeDuplicates(int[] nums) {
     int index=1;
     int size = nums.length;
        for(int i=1; i< size; i++) {
            if(nums[i] != nums[i-1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}