// Last updated: 12/8/2026, 1:41:39 pm
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
12    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
13        ListNode newNode=new ListNode(0);
14        ListNode current=newNode;
15        while(list1!=null && list2!=null){
16        if( list1.val<=list2.val){
17            current.next=list1;
18            current=current.next;
19            list1=list1.next;
20        }
21        else{
22            current.next=list2;
23            current=current.next;
24            list2=list2.next;
25        }
26        }
27        if(list1!=null){
28            current.next=list1;
29        }
30        else{
31            current.next=list2;
32        }
33        return newNode.next;
34    }
35}