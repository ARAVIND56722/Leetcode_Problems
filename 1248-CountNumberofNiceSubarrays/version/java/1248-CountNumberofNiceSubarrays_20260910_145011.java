// Last updated: 10/9/2026, 2:50:11 pm
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        return atMost(nums, k) - atMost(nums, k - 1);
4    }
5
6    public int atMost(int[] nums, int k) {
7        int left = 0;
8        int oddCount = 0;
9        int ans = 0;
10
11        for (int right = 0; right < nums.length; right++) {
12            if (nums[right] % 2 != 0) {
13                oddCount++;
14            }
15
16            while (oddCount > k) {
17                if (nums[left] % 2 != 0) {
18                    oddCount--;
19                }
20                left++;
21            }
22
23            ans += right - left + 1;
24        }
25
26        return ans;
27    }
28}