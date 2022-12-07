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
    int rangeSum;

    public int rangeSumBST(TreeNode root, int low, int high) {
        rangeSum = 0;
        getRangeSum(root,low,high);
        return rangeSum;
    }

    public void getRangeSum(TreeNode root, int low, int high) {
        if(root != null) {
            if(root.val >= low && root.val <= high) {
                rangeSum += root.val;
            }
            if(root.val > low) {
                getRangeSum(root.left, low,high);
            }
            if(root.val < high) {
                getRangeSum(root.right,low,high);
            }
        }
    }
}