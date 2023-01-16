class Solution {
    public int minimumSum(int num) {
        int[] res=new int[4];
        int i=0;
        while(num>0){
            res[i]=num%10;
            num/=10;
            i++;
        }
        Arrays.sort(res);
        return res[0]*10+res[2]+res[1]*10+res[3];
    }
}