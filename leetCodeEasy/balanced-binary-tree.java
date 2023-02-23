class Solution {
    public int ht(TreeNode root)
    {
        if(root==null)
            return -1;
        return Math.max(ht(root.left),ht(root.right))+1;
    }
    public boolean isBalanced(TreeNode root) {
        if(root == null)
            return true;
        
        boolean l = isBalanced(root.left);
        boolean r = isBalanced(root.right);
        int left = ht(root.left);
        int right = ht(root.right);
    
        if(Math.abs(left-right) >= 2)   
            return false;
        return l&&r;
    }
}