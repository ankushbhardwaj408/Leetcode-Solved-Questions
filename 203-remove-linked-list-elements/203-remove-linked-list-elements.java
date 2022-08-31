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

    public ListNode removeElements(ListNode head, int val) {
        ListNode prev = null;
        ListNode temp = head;
        while (temp != null) {
            if (head.val == val) {
                head = head.next;
                temp = head;
            } else if (temp.val == val) {
                prev.next = temp.next;
                temp = temp.next;
            } else if (temp.next == null && temp.val == val) {
                prev.next = null;
                temp = temp.next;
            } else {
                prev = temp;
                temp = temp.next;
            }
        }
        return head;
    }
}
