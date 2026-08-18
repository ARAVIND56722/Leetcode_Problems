// Last updated: 18/8/2026, 12:30:55 pm
1class Solution {
2    public boolean isValid(String s) {
3        Stack <Character> stack=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='[' || ch=='{' || ch=='('){
7                stack.push(ch);
8            }
9            else{
10                if(stack.isEmpty()){
11                    return false;
12                }
13                
14            
15            else if( ch==')' && stack.peek()=='('||
16              ch=='}' && stack.peek()=='{' || 
17              ch==']' && stack.peek()=='['
18              ){
19                stack.pop();
20            }
21            else{
22                return false;
23            }
24        }
25        }
26        
27        
28        return stack.isEmpty();
29    }
30}