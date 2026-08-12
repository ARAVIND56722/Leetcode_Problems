// Last updated: 12/8/2026, 2:49:49 pm
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
12    public ListNode deleteDuplicates(ListNode head) {
13        ListNode duplicate=new ListNode(0);
14        if(head==null){
15            return head;
16        }
17      
18        ListNode point1=head;
19        ListNode current=duplicate;
20        while(point1!=null){
21            if(point1.next!=null && point1.val==point1.next.val){
22               int duplicateValue = point1.val;
23               while(point1!=null && point1.val==duplicateValue){
24                 point1=point1.next;
25               }
26            }
27            else{
28               current.next=point1;
29               current=current.next;
30               point1=point1.next;
31            }
32        }
33        current.next=null;
34        return duplicate.next;
35    }
36}