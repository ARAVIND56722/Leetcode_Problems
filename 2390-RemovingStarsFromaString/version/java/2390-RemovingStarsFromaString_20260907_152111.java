// Last updated: 7/9/2026, 3:21:11 pm
1class Solution {
2    public String makeGood(String s) {
3        Stack <Character> st=new Stack<>();
4        for(int i=0;i<s.length();i++){
5            char ch=s.charAt(i);
6            if(st.isEmpty()){
7                st.push(ch);
8            }
9            else if(Character.toLowerCase(st.peek())== Character.toLowerCase(ch) 
10            && 
11            ((Character.isUpperCase(st.peek())==Character.isLowerCase(ch) || (Character.isLowerCase(st.peek()) && Character.isUpperCase(ch))))){
12                st.pop();
13            }
14            
15            else{
16                st.push(s.charAt(i));
17            }
18        }
19        String str="";
20        while(!st.isEmpty()){
21            str=st.pop()+str;
22        }
23        return str;
24    }
25}