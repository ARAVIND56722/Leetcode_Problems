// Last updated: 14/7/2026, 2:17:47 pm
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
    public boolean isPalindrome(ListNode head) {
         ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        ListNode temp = head;

        while (temp != null) {
            tail.next = new ListNode(temp.val);
            tail = tail.next;
            temp = temp.next;
        }
        ListNode prev=null;
        ListNode next=null;
        ListNode current=dummy.next;
        boolean palindrome=false;
        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
         ListNode original = head;
        ListNode reversed = prev;

        while(original!=null && reversed!=null){
            if(original.val!=reversed.val){
                return false;
            }
            original=original.next;
            reversed=reversed.next;
        }
       return true;
        

        
    }
}