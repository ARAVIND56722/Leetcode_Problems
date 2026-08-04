// Last updated: 4/8/2026, 10:02:18 pm
1class Solution {
2    public int[] sortedSquares(int[] nums) {
3        int left=0;
4        int right=nums.length-1;
5        int arr[]=new int[nums.length];
6        int index=nums.length-1;
7        while(left<=right){
8            int ls=nums[left]*nums[left];
9            int rs=nums[right]*nums[right];
10            if(rs>ls){
11                arr[index]=rs;
12                right--;
13            }
14            else{
15                arr[index]=ls;
16                left++;
17            }
18            index--;
19
20        }
21        return arr;
22    }
23}