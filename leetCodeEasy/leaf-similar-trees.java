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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        if(root1==null || root2==null) return false;
        List<Integer> list1 = new LinkedList<>();
        List<Integer> list2 = new LinkedList<>();
        DFS(root1,list1);
        DFS(root2,list2);
        if(list1.size() != list2.size()) 
            return false;
    
        return list1.equals(list2);
    }


     public void DFS(TreeNode root,List<Integer> list){
        if(root.left==null && root.right==null) {
            list.add(root.val);
            return;
        }
        
        if(root.left!=null) DFS(root.left,list);
        if(root.right!=null) DFS(root.right,list);
    }
}