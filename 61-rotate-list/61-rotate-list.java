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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        if(head.next==null) return head;
        ListNode temp=head;
        int size=0;
        
ListNode tail=temp;
        while(temp!=null)
        {
            size++;
            tail=temp;
            temp=temp.next;
        }
        if(size==k) return head;
        if(size<k)
        {
            k=k%size;
        }
        ListNode node=head;
        for(int i=0;i<size-k-1;i++)
        {
            node=node.next;
        }
        tail.next=head;
        head=node.next;
        node.next=null;
        return head;
    }
}