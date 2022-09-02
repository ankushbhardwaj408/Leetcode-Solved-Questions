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
   public void reorderList(ListNode head) {
if(head==null || head.next==null) return;

ListNode mid=middle(head);
ListNode secondhead=reverse(mid);
       ListNode firsthead=head;
while(firsthead!=null && secondhead!=null)
{
    ListNode temp=firsthead.next;
    firsthead.next=secondhead;
    firsthead=temp;
    temp=secondhead.next;
    secondhead.next=firsthead;
    secondhead=temp;
}
if(firsthead!=null)
{
    firsthead.next=null;
}

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