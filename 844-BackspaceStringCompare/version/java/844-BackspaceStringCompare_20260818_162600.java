// Last updated: 18/8/2026, 4:26:00 pm
1class Solution {
2    public int evalRPN(String[] tokens) {
3        Stack <Integer> stack=new Stack<>();
4        for(int i=0;i<tokens.length;i++){
5             String s=tokens[i];
6             if(s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/")){
7                 int first=stack.pop();
8                 int second=stack.pop();
9                if(s.equals("+")){
10                   stack.push(first+second);
11                }
12                else if(s.equals("*") ){
13                    stack.push(first*second);
14
15                }
16                else if(s.equals("/")){
17                    stack.push(second/first);
18
19                }
20                else if(s.equals("-")){
21                    stack.push(second-first);
22
23                }
24             }
25             else{
26                int n=Integer.parseInt(s);
27                stack.push(n);
28             }
29             
30        }
31       return stack.pop();
32    }
33}