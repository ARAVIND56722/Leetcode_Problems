// Last updated: 14/7/2026, 2:17:45 pm
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
     node.val=node.next.val;
     node.next=node.next.next;
        
    }
}