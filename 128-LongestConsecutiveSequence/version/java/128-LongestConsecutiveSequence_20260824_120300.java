// Last updated: 24/8/2026, 12:03:00 pm
1class Solution {
2    public int longestConsecutive(int[] nums) {
3          if (nums.length == 0) {
4            return 0;
5        }
6        HashMap<Integer,Integer> map = new HashMap<>();
7        Arrays.sort(nums);
8        for(int i=0;i<nums.length;i++){
9            map.put(nums[i],1);
10        }
11       
12        
13        int max=0;
14        for (int key : map.keySet()) {
15             if (!map.containsKey(key - 1)) {
16                int count = 1;
17                int n = key;
18                while (map.containsKey(n + 1)) {
19                     n++;
20                    count++;
21                }
22
23                 max = Math.max(max, count);
24            }
25        }
26        return max;
27    }
28}