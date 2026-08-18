// Last updated: 18/8/2026, 11:17:57 am
1class Solution {
2    public int calPoints(String[] operations) {
3        Stack <Integer> stack= new Stack<>();
4        for(int i=0;i<operations.length;i++){
5            String ch=operations[i];
6            if(!ch.equals("C") && !ch.equals("D") && !ch.equals("+")){
7                int num=Integer.parseInt(ch);
8                stack.push(num);
9            }
10            if(ch.equals("C")){
11                stack.pop();
12            }
13            if(ch.equals("D")){
14                stack.push(stack.peek()*2);
15            }
16            if(ch.equals("+")){
17                 int first=stack.pop();
18                int second=stack.peek();
19                stack.push(first);
20                stack.push(first+second);
21            }
22        }
23        int sum=0;
24        int n=stack.size();
25        for(int i=0;i<n;i++){
26           sum=sum+stack.peek();
27           stack.pop();
28        }
29        return sum;
30    }
31}