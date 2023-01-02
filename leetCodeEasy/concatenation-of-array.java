class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] newArray = new int[2*len];
        for(int i = 0; i < len; i++) {
            newArray[i] = nums[i];
            newArray[i+len] = nums[i];
        }

        return newArray;
    }
}