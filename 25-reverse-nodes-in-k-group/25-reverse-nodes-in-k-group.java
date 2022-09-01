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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null) return head;
        if(head.next==null) return head;
        if(k==1) return head;
        int size=0;
        ListNode temp=head;
        while(temp!=null)
        {
            size++;
            temp=temp.next;
        }
        int x=size/k;
      ListNode prev=null;
        ListNode current=head;
        while(x!=0)
      {
        ListNode last=prev;
        ListNode newend=current;
      ListNode next=current.next;
        for(int j=0;current!=null && j<k;j++)
        {
            current.next=prev;
            prev=current;
            current=next;
            if(next!=null)
            {
                 next=next.next;
            }
           
        }
        if(last!=null)
        {
            last.next=prev;
        }else{
            head=prev;
        }
        newend.next=current;
            prev=newend;
            x--;
      }
        return head;
    }
}