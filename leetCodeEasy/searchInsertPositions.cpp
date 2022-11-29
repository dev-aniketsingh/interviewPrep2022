class Solution {

    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length-1;
        int mid; 
        while(low <= high) {
            mid = (high+low)/2;
            if(target>nums[mid])
                 low =mid+1;
             else if(nums[mid]>target)
                 high =mid-1;
            else
                return mid ;
        }  
        return low;
    }
}