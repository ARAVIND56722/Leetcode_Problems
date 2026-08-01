// Last updated: 1/8/2026, 10:02:02 pm
1class Solution {
2    public int maxArea(int[] height) {
3
4        int left = 0;
5        int right = height.length - 1;
6        int max = 0;
7
8        while (left < right) {
9
10            int width = right - left;
11            int h = Math.min(height[left], height[right]);
12            int area = width * h;
13
14            max = Math.max(max, area);
15
16            if (height[left] < height[right]) {
17                left++;
18            } else {
19                right--;
20            }
21        }
22
23        return max;
24    }
25}