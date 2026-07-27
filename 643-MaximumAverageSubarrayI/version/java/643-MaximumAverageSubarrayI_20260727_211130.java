// Last updated: 27/7/2026, 9:11:30 pm
1class Solution {
2    public double findMaxAverage(int[] nums, int k) {
3        
4        double sum=0;
5        for(int i=0;i<k;i++){
6            sum=sum+nums[i];
7        }
8        int left=0;
9        double max= (double)sum/k;
10        for(int right=k;right<nums.length;right++){
11            sum=sum-nums[left]+nums[right];
12            double avg=(double)sum/k;
13            left++;
14            if(avg>max){
15               max=avg;
16            }
17        }
18        return max;
19    }
20}