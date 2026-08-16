// Last updated: 16/8/2026, 9:40:07 am
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
9 * }
10 */
11class Solution {
12    public ListNode reverseBetween(ListNode head, int left, int right) {
13        ListNode  res=new ListNode(0);
14        ListNode dummy=res;
15        ListNode current=head;
16        for(int i=1;i<left;i++){
17            dummy.next=current;
18            dummy=dummy.next;
19            current=current.next;
20        }
21        ListNode tail=current;
22        ListNode prev=null;
23        ListNode next=null;
24        int count=left;
25        while(current!=null && count<=right){
26            next=current.next;
27            current.next=prev;
28            prev=current;
29            current=next;
30            count++;
31        }
32        dummy.next=prev;
33        tail.next=current;
34        return res.next;
35        
36    }
37}