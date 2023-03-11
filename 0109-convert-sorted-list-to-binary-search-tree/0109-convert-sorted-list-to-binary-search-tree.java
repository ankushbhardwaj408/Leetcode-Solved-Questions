/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
        if(head==null)return null;
         if(head.next==null)return new TreeNode(head.val);
        ListNode node=head;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode ans=new TreeNode(slow.next.val);
        ListNode newhead=slow.next;
        slow.next=null;
        TreeNode left=sortedListToBST(node);
          ans.left=left;
        if(newhead.next!=null)
        {
             TreeNode right=sortedListToBST(newhead.next);
             ans.right=right;
        }
      return ans;
       
        
    
    }
}