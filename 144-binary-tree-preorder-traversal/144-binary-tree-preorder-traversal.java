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
    public List<Integer> preorderTraversal(TreeNode root) {
       List<Integer> list=new ArrayList<>();
        if(root==null) return list;
        list.add(root.val);
         List<Integer> list1=preorderTraversal(root.left);
        List<Integer> list2=preorderTraversal(root.right);
        
        list.addAll(list1);
        list.addAll(list2);
        return list;
        
        
        
        
//         Stack<TreeNode> s=new Stack<>();
//         List<Integer> ans=new ArrayList<>();
      
//         TreeNode current=root;
//         while(true)
//         {
//             if(current!=null){
//                 ans.add(current.val);
//                   s.push(current);
//             current=current.left;
              
//             }else{
//                 if(s.isEmpty()) break;
               
//                 TreeNode node=s.pop();
//                 current=node.right;
                
//             }
            
//         }
//         return ans;
    }
   
}