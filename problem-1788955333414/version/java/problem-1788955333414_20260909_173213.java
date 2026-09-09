// Last updated: 9/9/2026, 5:32:13 pm
1class Solution {
2    public int[] finalPrices(int[] prices) {
3        Stack <Integer> st=new Stack<>();
4        HashMap <Integer,Integer> map= new HashMap<>();
5        int res[]=prices.clone();
6        for(int i=0;i<prices.length;i++){
7            while(!st.isEmpty() && prices[st.peek()]>=prices[i]){
8                int index=st.pop();
9                res[index]=prices[index]-prices[i];
10            }
11            st.push(i);
12        }
13        
14       
15        return res;
16    }
17}