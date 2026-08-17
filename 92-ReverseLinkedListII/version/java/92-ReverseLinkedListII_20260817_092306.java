// Last updated: 17/8/2026, 9:23:06 am
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
12    public ListNode reverseKGroup(ListNode head, int k) {
13        ListNode cur=head;
14        int count=0;
15        while(cur!=null){
16           count++;
17           cur=cur.next;
18         }
19         ListNode res=new ListNode(0);
20         ListNode curr=res;
21         ListNode current=head;
22         for(int i=0;i+k<=count;i+=k){
23            ListNode prev=null;
24            ListNode next=null;
25            ListNode tail=current;
26            for(int j=i;j<i+k;j++){
27                next=current.next;
28                current.next=prev;
29                prev=current;
30                current=next;
31            }
32            curr.next=prev;
33            curr=tail;
34         }
35         curr.next = current;
36         return res.next;
37
38    }
39}