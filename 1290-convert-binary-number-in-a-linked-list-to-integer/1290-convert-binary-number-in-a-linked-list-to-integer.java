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

    public int getDecimalValue(ListNode head) {
        ListNode temp = head;
        int size = 0;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        return fun(head, size, 0);
    }

    public int fun(ListNode node, int size, int sum) {
        if (size == 0) return 0;
        sum += node.val * (Math.pow(2, size - 1)) + fun(node.next, size - 1, sum);

        return sum;
    }
}
