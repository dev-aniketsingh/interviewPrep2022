class Solution {
    int maxDepth = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        maxDepth(root);
        return maxDepth;
    }
     public int maxDepth(TreeNode root) {
        if(root == null)
            return 0;
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        maxDepth = Math.max(maxDepth, leftHeight+rightHeight);
        return Math.max(leftHeight,rightHeight) + 1;
    }
}