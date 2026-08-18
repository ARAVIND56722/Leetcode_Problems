// Last updated: 18/8/2026, 11:46:31 am
1class Solution {
2    public String removeDuplicates(String s) {
3        Stack <Character> stack=new Stack<>();
4        StringBuilder str=new StringBuilder();
5        for(int i=0;i<s.length();i++){
6                
7                char ch=s.charAt(i);
8                stack.push(ch);
9                if(stack.size()>=2){
10                  char ch1= stack.pop();
11                  char ch2= stack.peek();
12                  if(ch1==ch2){
13                    stack.pop();
14                  }
15                  else{
16                    stack.push(ch1);
17                  }
18
19                }  
20        }
21        int n=stack.size();
22        for(int i=0;i<n;i++){
23            str.append(stack.pop());
24        }
25        return str.reverse().toString();
26        
27    }
28}