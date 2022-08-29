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
    public int rangeSumBST(TreeNode root, int low, int high) {
        int x=sumo(root,low,high);
        return x;
        
    }
    public int sumo(TreeNode root,int low ,int high)
    {
        if(root==null) return 0;
        int z=0;
        if(root.val>=low && root.val<=high) z=root.val;
        int x=sumo(root.left,low,high);
         int y=sumo(root.right,low,high);
        return x+y+z;
    }
}