class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.sort(nums);
        int start=0, end = n-1;
        int index=0;
        while(start <= end) {
            ans[index++] = nums[start++];
            if(index == nums.length) {
                break;
            }
            ans[index++] = nums[end--];
        }
    
        return ans;
    }
}