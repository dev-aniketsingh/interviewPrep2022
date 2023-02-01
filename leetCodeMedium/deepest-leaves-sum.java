/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        var queue = new LinkedList<TreeNode>();
        queue.addFirst(root);
        int levelSum = 0;
        while(!queue.isEmpty()) {
            levelSum = 0;
            int size = queue.size();
            for(int i = 0; i < size; i++) {
                TreeNode current = queue.removeLast();
                levelSum += current.val;
                if(current.right != null)
                    queue.addFirst(current.right);
                if(current.left != null) 
                    queue.addFirst(current.left);
            }
        }
        return levelSum;
    }

}