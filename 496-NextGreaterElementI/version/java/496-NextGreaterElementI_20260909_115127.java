// Last updated: 9/9/2026, 11:51:27 am
1class Solution {
2    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
3       Stack <Integer> st=new Stack<>();
4       int res[]=new int[nums1.length];
5       HashMap<Integer,Integer> map=new HashMap<>();
6       for(int num:nums2){
7           while(!st.isEmpty() && st.peek()<num){
8                map.put(st.pop(),num);
9           }
10           st.push(num);
11       }
12       for(int i=0;i<nums1.length;i++){
13          if(map.containsKey(nums1[i])){
14               res[i]=map.get(nums1[i]);
15           }
16           else{
17               res[i]=-1;
18           }
19       }
20       return res; 
21    }
22}