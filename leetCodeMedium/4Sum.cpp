class Solution {
public:
    vector<vector<int>> fourSum(vector<int>& nums, int target) {
        int n = nums.size();
        vector<vector<int>> mainAns;
        sort(nums.begin(), nums.end());
        for (int i = 0; i < n - 3; i++) {
            if (i > 0 and nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 and nums[j] == nums[j - 1]) {
                    continue;
                }
                int low = j + 1, high = n - 1;
                while (low < high) {
                    if (low > j + 1 and nums[low] == nums[low - 1]) {
                        low++;
                        continue;
                    }
                    if (high < n - 1 and nums[high] == nums[high + 1]) {
                        high--;
                        continue;
                    }
                    long long int sum = (long long int)nums[low] + (long long int)nums[high] + (long long int)nums[i] + (long long int)nums[j];
                    if (sum == target) {
                        mainAns.push_back({nums[low], nums[high], nums[i], nums[j]});
                        high--;
                        low++;
                    }
                    else if (sum > target) {
                        high--;
                    }
                    else {
                        low++;
                    }
                }
            }
        }
        return mainAns;
    }
};