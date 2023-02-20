class Solution {
  public int missingNumber(int[] nums) {
    int len = nums.length;
    Arrays.sort(nums);
    for(int i = 0; i < len; i++) {
        if(nums[i] != i)
          return i;
    }  
    return len;
  }
}


//optimal 
class Solution {
  public int missingNumber(int[] nums) {
      int n=nums.length,
          totalsum=n*(n+1)/2; //sum of first n natural numbers
      for(int i:nums)
          totalsum-=i;
      return totalsum;
  }
}
