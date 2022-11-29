class Solution {
public:
    int singleNumber(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        int i, n = nums.size();
        for(i = 1; i < n; i+=2) {
           if(nums[i] != nums[i-1]) {
               return nums[i-1];
           }  
        }
        return nums[n-1];
    }
};
