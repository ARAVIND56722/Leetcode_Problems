// Last updated: 14/7/2026, 2:16:44 pm
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
    public ListNode middleNode(ListNode head) {

        int count = 0;
        ListNode current = head;

        // Count total nodes
        while (current != null) {
            count++;
            current = current.next;
        }

        // Move to middle node
        current = head;
        for (int i = 0; i < count / 2; i++) {
            current = current.next;
        }

        return current;
    }
}