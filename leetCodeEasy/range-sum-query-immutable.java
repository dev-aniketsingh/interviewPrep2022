class NumArray {
    private int[] prefixSum;

    public NumArray(int[] nums) {
        int len = nums.length;
        prefixSum = new int[len];
        for(int i = 0; i < len; i++) {
            prefixSum[i] = nums[i];
            if(i > 0) 
                prefixSum[i] += prefixSum[i-1];
        } 
    }
    
    public int sumRange(int left, int right) {
        if(left > 0)
            return (prefixSum[right] - prefixSum[left-1]);
        return prefixSum[right];
    }
}

/**
 * Your NumArray object will be instantiated and called as such:
 * NumArray obj = new NumArray(nums);
 * int param_1 = obj.sumRange(left,right);
 */