// Last updated: 28/7/2026, 9:49:06 pm
1class Solution {
2    public int maxProduct(int[] nums) {
3        int max=0;
4        
5        Arrays.sort(nums);
6        max=(nums[nums.length-1]-1)*(nums[nums.length-2]-1);
7        
8        return max;
9    }
10}