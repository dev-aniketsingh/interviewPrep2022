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

//fastest sol
class Solution {
    public void moveZeroes(int[] nums) {
      int i = 0;
      int j = 0;

  while (i < nums.length && j < nums.length) {
    if (nums[j] != 0) {
      nums[i] = nums[j];
      i++;
      j++;
    }
    else {
      j++;
    }
  }
  while (i < nums.length) {
    nums[i] = 0;
    i++;
  }
    }
}