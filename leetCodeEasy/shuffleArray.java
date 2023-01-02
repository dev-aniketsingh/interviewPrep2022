class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] newArray = new int[n*2];
        int xPointer = 0, yPointer =  n;
        for(int i = 0; i < n*2; i+=2) {
            newArray[i] = nums[xPointer++];
            newArray[i+1] = nums[yPointer++];
        }
        return newArray;
    }
}