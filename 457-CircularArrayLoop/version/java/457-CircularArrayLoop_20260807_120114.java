// Last updated: 7/8/2026, 12:01:14 pm
1class Solution {
2    public int removeDuplicates(int[] nums) {
3        
4        int slow=0;
5        
6        
7          for(int fast=1;fast<nums.length;fast++){
8               if(nums[slow]!=nums[fast]){
9                 slow++;
10                nums[slow]=nums[fast];
11               
12               }
13          }
14        return slow+1;
15    }
16}