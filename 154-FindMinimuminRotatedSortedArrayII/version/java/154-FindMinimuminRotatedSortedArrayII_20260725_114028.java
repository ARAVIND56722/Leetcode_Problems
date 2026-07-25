// Last updated: 25/7/2026, 11:40:28 am
1class Solution {
2    public int findMin(int[] nums) {
3        int min=nums[0];
4        for(int i=1;i<nums.length;i++){
5            if(min>nums[i]){
6                min=nums[i];
7            }
8        }
9        return min;
10    }
11}