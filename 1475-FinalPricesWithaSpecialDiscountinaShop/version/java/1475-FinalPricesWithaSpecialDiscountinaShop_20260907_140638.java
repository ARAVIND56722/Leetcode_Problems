// Last updated: 7/9/2026, 2:06:38 pm
1class Solution {
2    public int[] finalPrices(int[] prices) {
3         Stack <Integer> st=new Stack<>();
4         for(int i=0;i<prices.length;i++){
5            boolean found=false;
6            for(int j=i+1;j<prices.length;j++){
7                  if(prices[i]>=prices[j]){
8                      st.push(prices[i]-prices[j]);
9                      found=true;
10                      break;
11                  }
12            }
13            if(!found){
14                st.push(prices[i]);
15            }
16         }
17         int arr[]=new int[st.size()];
18         for(int j=arr.length-1;j>=0;j--){
19            arr[j]=st.pop();
20         }
21         return arr;
22    }
23}