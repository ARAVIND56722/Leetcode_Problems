// Last updated: 28/7/2026, 10:43:28 pm
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3      int arr[]=new int[nums.length];
4      int leftprod=1;
5      for(int i=0;i<nums.length;i++){
6         arr[i]=leftprod;
7         leftprod=leftprod*nums[i];
8      } 
9      int rightprod=1;
10      for(int i=nums.length-1;i>=0;i--){
11        arr[i]=arr[i]*rightprod;
12        rightprod=rightprod*nums[i];
13      }
14      return arr;
15    }
16}