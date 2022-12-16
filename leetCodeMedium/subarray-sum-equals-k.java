class Solution {
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        Map<Integer, Integer> prefixSumToCountMap = new HashMap<>();
        int subarrayCount = 0;
        int currentSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currentSum += nums[i];
            if (currentSum == k) {
                subarrayCount++;
            }
            if (prefixSumToCountMap.containsKey(currentSum - k)) {
                subarrayCount += prefixSumToCountMap.get(currentSum - k);
            }
            prefixSumToCountMap.put(currentSum, prefixSumToCountMap.getOrDefault(currentSum, 0) + 1);
        }
        return subarrayCount;
    }
}