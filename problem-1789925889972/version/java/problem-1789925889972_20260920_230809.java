// Last updated: 20/9/2026, 11:08:09 pm
1class Solution {
2    public int reverseDegree(String s) {
3        int sum = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            int value = 'z' - s.charAt(i) + 1;
7            sum += value * (i + 1);
8        }
9
10        return sum;
11    }
12}