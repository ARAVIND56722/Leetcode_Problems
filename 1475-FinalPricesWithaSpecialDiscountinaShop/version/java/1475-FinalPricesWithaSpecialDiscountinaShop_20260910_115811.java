// Last updated: 10/9/2026, 11:58:11 am
1class Solution {
2    public int[] dailyTemperatures(int[] temperatures) {
3        Stack <Integer> st=new Stack<>();
4        int arr[]=new int[temperatures.length];
5        for(int i=0;i<temperatures.length;i++){
6            while(!st.isEmpty() && temperatures[st.peek()]<temperatures[i]){
7                int num=i-st.peek();
8                arr[st.pop()]=num;
9            }
10            st.push(i);
11        }
12        return arr;
13    }
14}