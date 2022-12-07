class Solution {
    public void rotate(int[] nums, int k) {
        int size = nums.length-1;
        k = k % nums.length;
        if(k == 0) {
            return;
        }
        reverse(nums,0,size);
        reverse(nums,0,k-1);
        reverse(nums,k,size);
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}