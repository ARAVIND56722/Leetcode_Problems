// Last updated: 30/7/2026, 12:16:19 pm
1class Solution {
2    public int minSubArrayLen(int target, int[] nums) {
3        int sum=0;
4        int left=0;
5        int min=Integer.MAX_VALUE;
6        boolean found=false;
7        for(int right=0;right<nums.length;right++){
8            
9            sum=sum+nums[right];
10           while(sum>=target){
11            found=true;
12            if(right-left+1<min){
13                min=right-left+1;
14                
15            }
16            sum=sum-nums[left];
17            left++;
18           }
19           
20        }
21        if(found){
22          return min;
23        }
24        return 0;
25    }
26}