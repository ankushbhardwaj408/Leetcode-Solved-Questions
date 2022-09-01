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

    public ListNode insertionSortList(ListNode head) {
        ListNode temp = head;
        ListNode next = temp.next;

        while (temp!= null) {
            ListNode start = head;
            ListNode end = head;
            while (start != temp) {
                if (start.val > temp.val) {
                    temp.next=start;
                    if(start==head){
                        head=temp;
                    }else{
                        end.next=temp;
                    } 
                    while(start.next!=temp)
                    {
                        start=start.next;
                    }
                    start.next=next;
                    break;
                } else {
                    end = start;
                    start = start.next;
                }
            }

            temp = next;
            if(next!=null)
            {
                 next = next.next;
            }
           
        }
        return head;
    }
}
