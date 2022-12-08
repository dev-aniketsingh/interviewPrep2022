class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack = new Stack<>();
        int score = 0;
        int len = operations.length;
        for(int i = 0; i < len; i++) {
            String s = operations[i];
            if(s.equals("C")) {
                stack.pop();
            }
            else if(s.equals("D")) {
                int temp = Integer.valueOf(stack.pop());
                stack.push(temp);
                stack.push(temp*2);
            }
            else if(s.equals("+")) {
                int pre_score1 = Integer.valueOf(stack.pop());
                int pre_score2 = Integer.valueOf(stack.peek());
                stack.push(pre_score1);
                stack.push(pre_score1+pre_score2);
            }
            else {
                 stack.push(Integer.valueOf(s));
            }
        }
        while(!stack.isEmpty()){
            score += stack.pop();
        }
        return score;
    }
}