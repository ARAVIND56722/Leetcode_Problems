// Last updated: 7/9/2026, 2:17:39 pm
1class Solution {
2    public String removeStars(String s) {
3        Stack <Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='*'){
6                st.pop();
7            }
8            else{
9                st.push(s.charAt(i));
10            }
11        }
12        StringBuilder sb= new StringBuilder();
13        while(!st.isEmpty()){
14            sb.insert(0,st.pop());
15        }
16        return sb.toString();
17    }
18}