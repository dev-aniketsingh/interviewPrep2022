class Solution {
    public int subtractProductAndSum(int n) {
        int productTotal = 1, 
            sumTotal = 0;
        while(n > 0) {
            int num = n % 10;
            sumTotal += num;
            productTotal *= num;
            n = n / 10;
        }
        return productTotal- sumTotal;
    }
}