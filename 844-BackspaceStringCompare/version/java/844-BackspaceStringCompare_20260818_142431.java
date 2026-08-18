// Last updated: 18/8/2026, 2:24:31 pm
1class Solution {
2    public boolean backspaceCompare(String s, String t) {
3        Stack <Character> stack=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(ch=='#'){
7                if(!stack.isEmpty() ){
8                   stack.pop();
9                }
10            }
11            else{
12               stack.push(ch);
13            }
14        }
15        Stack <Character> st=new Stack<>();
16        for(int i=0;i<t.length();i++){
17            char ch=t.charAt(i);
18          
19            if(ch=='#'){
20                 if(!st.isEmpty() ){
21                   st.pop();
22                }
23            
24            }
25            else{
26                st.push(ch);
27            }
28        }
29    
30        if(stack.size()!=st.size()){
31            return false;
32        }
33        else{
34            while(!stack.isEmpty()){
35                if(stack.peek()!=st.peek()){
36                    return false;
37                }
38                stack.pop();
39                st.pop();
40            }
41
42        }
43        return true;
44    }
45}