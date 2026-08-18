// Last updated: 18/8/2026, 4:25:26 pm
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack <Integer> stack=new Stack<>();
4        for(int i=0;i<tokens.length;i++){
5             String s=tokens[i];
6             char ch=s.charAt(0);
7             if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
8                 int first=stack.pop();
9                 int second=stack.pop();
10                if(s.equals("+")){
11                   stack.push(first+second);
12                }
13                else if(s.equals("*") ){
14                    stack.push(first*second);
15
16                }
17                else if(s.equals("/")){
18                    stack.push(second/first);
19
20                }
21                else if(s.equals("-")){
22                    stack.push(second-first);
23
24                }
25             }
26             else{
27                int n=Integer.parseInt(s);
28                stack.push(n);
29             }
30             
31        }
32       return stack.pop();
33    }
34}