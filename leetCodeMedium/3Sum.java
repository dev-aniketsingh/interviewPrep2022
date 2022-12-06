class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> threeSumList = new ArrayList<List<Integer>>();
        if (nums.length<3) 
            return threeSumList;
        Arrays.sort(nums);
        int start;
        int size = nums.length - 2;
        for(int i = 0; i < size; i++) {
            start = i+1;
            int end = nums.length - 1;
            while(start < end) {
                    int sum = nums[start] + nums[end];
                    if((nums[i] + sum == 0)) {
                        List<Integer> numsList =new ArrayList<Integer>();
                            numsList.add(nums[start]);
                            numsList.add(nums[end]);
                            numsList.add(nums[i]);
                            start++;
                            end--;
                            if(!threeSumList.contains(numsList)){
                                threeSumList.add(numsList);
                            }                    
                    }
                    else if(nums[i] + sum < 0) {
                        start++;
                    }
                    else {
                        end--;
                    }
            }
            
        }
        return threeSumList;
    }
}