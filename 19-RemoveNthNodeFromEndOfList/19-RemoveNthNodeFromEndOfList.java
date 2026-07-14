// Last updated: 14/7/2026, 2:18:44 pm
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
    public ListNode removeNthFromEnd(ListNode head, int n) {
       ListNode current=head;
       int count=1;
       while(current.next!=null){
        count++;
        current=current.next;

       }
       ListNode curr=head;
       int num=1;
       if(count==n){
        return head.next;
       }
       while( curr.next!=null  && count-num != n ){
           curr=curr.next;
           num++;
       }
       curr.next=curr.next.next;
       return head;
       
    }
}