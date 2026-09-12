// Last updated: 12/9/2026, 11:51:19 am
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3        HashSet <Integer> set=new HashSet<>();
4        int left=0;
5        int sum=0;
6        int max=0;
7        for(int right=0;right<nums.length;right++){
8            while(set.contains(nums[right])){
9                sum=sum-nums[left];
10                set.remove(nums[left]);
11                left++;
12            }
13            set.add(nums[right]);
14            sum=sum+nums[right];
15            max=Math.max(max,sum);
16        }
17        return max;
18    }
19}