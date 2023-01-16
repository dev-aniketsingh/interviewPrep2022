class Solution {

    public int digitSum(int num){
        int sum = 0;
        while(num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public int differenceOfSum(int[] nums) {
        int sum = 0, sumOfDigits = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i];
            sumOfDigits += digitSum(nums[i]);
        }
        return Math.abs(sum-sumOfDigits);
    }
}