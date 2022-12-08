class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        if(n == 0)
            return res;
        generate(res,"", n,n);
        return res;
    }

    public void generate( List<String> res, String present, int left, int right) {
        if(right == 0)
            res.add(present);
        if(left > 0)
            generate(res,present+"(",left-1,right);
        if(right > left)
            generate(res,present+")", left,right-1);
    }
}