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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return fun(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    public TreeNode fun(int[] preorder,int start,int end, int[] inorder,int start1,int end1){
   
        if(start1>end1)return null;
        
        int y=preorder[start];
        TreeNode root=new TreeNode(y);
        int i=start1;
        for( i=start1;i<=end1;i++)
        {
            if(inorder[i]==root.val)break;
        }
        int no=i-1-start1;
        int z=no+start+1;//end of pre
        root.left=fun(preorder,start+1,z,inorder,start1,i-1);
         root.right=fun(preorder,z+1,end,inorder,i+1,end1);
        return root;
        
    }
}