/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       
      int length=0;
         ListNode s=head;
        ListNode f=head;
         length=hasCycle(head);
//          while( f!=null && f.next!=null){
//             s=s.next;
//             f=f.next.next;
           
//             if(s==f) {
//               length=hasCycle(s);
//                 break;
//             }
//          }
        if(length==0) return null;
        ListNode fast=head;
        ListNode slow=head;
       while(length>0)
       {
           fast=fast.next;
           length--;
       }
        while(slow!=fast)
        {
            slow=slow.next;
            fast=fast.next;
        }
        return slow;
    }
    
  public int hasCycle(ListNode head) {
       
        ListNode s=head;
        ListNode f=head;
        
        while( f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
           
            if(s==f) {
               //  ListNode temp=s;
                 int count=0;
                do{
                    s=s.next;
                    count++;
                }while(s!=f);
                return count;
            }
        }
        return 0;
    }
}