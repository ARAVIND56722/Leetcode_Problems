// Last updated: 17/9/2026, 11:48:12 am
1class Solution {
2    public int longestValidParentheses(String s) {
3          Stack <Integer> st=new Stack<>();
4          st.push(-1);
5          int count=0;
6          for(int i=0;i<s.length();i++){
7            char ch=s.charAt(i);
8            if(ch=='('){
9                st.push(i);
10            }
11            if( ch==')'){
12                st.pop();
13                
14            }
15            if(st.isEmpty()){
16                st.push(i);
17            }
18            else{
19                 count = Math.max(count, i - st.peek());
20            }
21          }
22          return count;                                            
23    }
24}