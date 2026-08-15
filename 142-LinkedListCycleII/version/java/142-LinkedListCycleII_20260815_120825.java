// Last updated: 15/8/2026, 12:08:25 pm
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
12    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
13       ListNode list1=l1;
14       ListNode list2=l2;
15       ListNode res=new ListNode(0);
16       ListNode dummy=res;
17       int carry=0;
18       while(list1!=null || list2!=null || carry!=0){
19        int sum=carry;
20        if(list1!=null){
21           sum=sum+list1.val;
22          list1=list1.next;
23        }
24        if(list2!=null){
25            sum=sum+list2.val;
26            list2=list2.next;
27        }
28        dummy.next=new ListNode(sum%10);
29        carry=sum/10;
30        dummy=dummy.next;
31       }
32       return res.next;
33    }
34}