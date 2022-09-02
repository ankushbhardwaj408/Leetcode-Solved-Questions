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
    public boolean isPalindrome(ListNode head) {
        ListNode mid=middle(head);
        ListNode headsecond=reverse(mid);
     
        while(head!=null && headsecond!=null)
        {
            if(head.val!=headsecond.val)
            {
              return false;
            }
            head=head.next;
           headsecond=headsecond.next;
        }
     
        return true;
    }
    public ListNode reverse(ListNode head)
{
        if(head==null) return head;
    ListNode prev=null;
    ListNode current=head;
    ListNode next=head.next;
    while(current!=null)
    {
        current.next=prev;
        prev=current;
        current=next;
        if(next!=null){
            next=next.next;
        }

    }
    return prev;
}
public ListNode middle(ListNode head)
{
    ListNode slow=head;
    ListNode fast=head;
    while(fast!=null && fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
    return slow;
}
}