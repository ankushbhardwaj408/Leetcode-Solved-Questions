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
    int ans=0;
    
    public int sumNumbers(TreeNode root) {
     fun(root,0);
        return ans;
    }
    public void fun(TreeNode root,int cur)
    {
        if(root==null)
        {
            
           return;
       
        }
        
        cur=(cur*10)+root.val;
        if(root.left==null && root.right==null)
        {
               ans=ans+cur;
        }
     
        fun(root.left,cur);
        fun(root.right,cur);
    }
}