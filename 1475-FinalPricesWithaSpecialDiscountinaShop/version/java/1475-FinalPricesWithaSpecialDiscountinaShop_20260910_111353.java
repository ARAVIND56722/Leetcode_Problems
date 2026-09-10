// Last updated: 10/9/2026, 11:13:53 am
1class Solution {
2    public int[] nextGreaterElements(int[] nums) {
3        Stack <Integer> st=new Stack<>();
4        int n=nums.length;
5        int arr[]=new int[n];
6        for(int i=0;i<n*2;i++){
7            while(!st.isEmpty() && nums[st.peek()]<nums[i%n]){
8                arr[st.pop()]=nums[i%n];
9            }
10            if(i<n){
11               st.push(i);
12            }
13        }
14        while(!st.isEmpty()){
15            arr[st.pop()]=-1;
16        }
17        return arr;
18    }
19}