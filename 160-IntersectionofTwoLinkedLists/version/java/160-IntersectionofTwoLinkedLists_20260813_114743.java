// Last updated: 13/8/2026, 11:47:43 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode(int x) {
7 *         val = x;
8 *         next = null;
9 *     }
10 * }
11 */
12public class Solution {
13    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
14        ListNode current=headA;
15        ListNode curr=headB;
16       while(current!=curr){
17        if(current==null){
18            current=headB;
19        }
20        else{
21            current=current.next;
22        }
23        if(curr==null){
24            curr=headA;
25        }
26        else{
27        curr=curr.next;
28        }
29       }
30       return current;
31    }
32}