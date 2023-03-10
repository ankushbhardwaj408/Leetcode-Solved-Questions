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
class Solution {

    ListNode head;
    int size;
   
    public Solution(ListNode head) {
        this.head=head;
        int size=0;
        ListNode node=head;
        while(node!=null)
        {
            size++;
            node=node.next;
        }
        this.size=size;
       
    }
    
    public int getRandom() {
      
        ListNode node=head;
        int c=0;
        int x=(int)(Math.random()*size);
      
     
        while(c!=x)
        {
            c++;
            node=node.next;
        }
        return node.val;
        
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(head);
 * int param_1 = obj.getRandom();
 */