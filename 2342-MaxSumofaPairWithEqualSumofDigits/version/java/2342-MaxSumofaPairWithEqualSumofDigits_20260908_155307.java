// Last updated: 8/9/2026, 3:53:07 pm
1class Solution {
2    public int maximumSum(int[] nums) {
3
4        HashMap<Integer, Integer> map = new HashMap<>();
5
6        int max = -1;
7
8        for(int i = 0; i < nums.length; i++) {
9
10            int n = nums[i];
11            int sum = 0;
12
13            while(n > 0) {
14                sum += n % 10;
15                n = n / 10;
16            }
17
18            if(map.containsKey(sum)) {
19
20                max = Math.max(max, nums[i] + map.get(sum));
21
22                if(nums[i] > map.get(sum)) {
23                    map.put(sum, nums[i]);
24                }
25
26            } else {
27                map.put(sum, nums[i]);
28            }
29        }
30
31        return max;
32    }
33}