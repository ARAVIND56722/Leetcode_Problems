// Last updated: 26/7/2026, 3:28:45 pm
1class Solution {
2    public int[] twoSum(int[] numbers, int target) {
3        
4        int left=0;
5        int right=numbers.length-1;
6        
7        while(left<right){
8            int sum=0;
9            sum=numbers[left]+numbers[right];
10            if(sum==target){
11                    return new int[]{left+1,right+1} ;
12            }
13            else if(sum<target){
14                left++;
15            }
16            else{
17                right--;
18            }
19         }
20         return new int[]{-1,-1} ;
21    }
22}