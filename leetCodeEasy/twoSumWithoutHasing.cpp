class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int i,j, n = nums.size();
        vector<int> v;
        for(i = 0; i < n; i++) {
            for(j = 0; j < i; j++) {
                if(nums[i] + nums[j] == target) {
                    v.push_back(i);
                    v.push_back(j);
                }
            }
        }
        return v;
    }
};
//this is O(n^2), using hash table, we can do it a lot faster