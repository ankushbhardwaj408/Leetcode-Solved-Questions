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
            String NT="X";
        HashSet<String> vis=new HashSet<>();
        Map<String,TreeNode> ans=new HashMap<>();
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
String s=post(root);
        return new LinkedList<>(ans.values());
    }
    public String post(TreeNode node)
    {
        // if(node==null)return NT;
        StringBuilder sb=new StringBuilder();
        String left=NT;
        String right=NT;
        
        if(node.left!=null)
        {
            left=post(node.left);
            
        }
          
        if(node.right!=null)
        {
            right=post(node.right);
            
        }
        sb.append(node.val);
        sb.append(",");
        sb.append(left);
        sb.append(",");
        sb.append(right);
        String s=sb.toString();
        check(s,node);
        vis.add(s);
       
        return s;
    }
    public void check(String s,TreeNode root)
    {
        if(vis.contains(s))
        {
            ans.put(s,root);
        }
    }
}