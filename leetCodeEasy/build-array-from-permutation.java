class Solution {
    public int[] buildArray(int[] nums) {
        int n = nums.length;
        int[] newArray = new int[n];
        for(int i = 0; i < n; i++) {
            newArray[i] = nums[nums[i]];
        }
        return newArray;
    }
}