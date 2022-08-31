/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp = headA;
        ListNode temp2 = headB;
        int size = 0;
        int size2 = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        while (temp2 != null) {
            temp2 = temp2.next;
            size2++;
        }
        int ans = 0;
        if (size > size2) {
            ans = size - size2;
            while (ans != 0) {
                headA = headA.next;
                ans--;
            }
        } else if (size2 > size) {
            ans = size2 - size;
            while (ans != 0) {
                headB = headB.next;
                ans--;
            }
        }
        while (headA != headB) {
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
