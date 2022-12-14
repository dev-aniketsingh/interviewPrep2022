class Solution {
    public void sortColors(int[] nums) {
       
       // Initialize low, mid, and high pointers
    int low = 0, mid = 0, high = nums.length - 1;

    while (mid <= high) {
        // If the current element is 0, swap it with the element at the low pointer
        // and increment both the low and mid pointers.
        if (nums[mid] == 0) {
            swap(nums, low, mid);
            low++;
            mid++;
        }
        // If the current element is 1, increment the mid pointer only.
        else if (nums[mid] == 1) {
            mid++;
        }
        // If the current element is 2, swap it with the element at the high pointer
        // and decrement the high pointer only.
        else if (nums[mid] == 2) {
            swap(nums, mid, high);
            high--;
        }
    }
}

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}