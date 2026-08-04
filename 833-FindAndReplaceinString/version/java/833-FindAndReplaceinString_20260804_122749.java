// Last updated: 4/8/2026, 12:27:49 pm
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int zeros = 0;
4
5        for (int i = 0; i < s.length(); i++) {
6            if (s.charAt(i) == '0') {
7                zeros++;
8            }
9        }
10
11        int leftOnes = 0;
12        int rightZeros = zeros;
13
14        int min = rightZeros;  
15
16        for (int i = 0; i < s.length(); i++) {
17
18            if (s.charAt(i) == '1') {
19                leftOnes++;
20            } else {
21                rightZeros--;
22            }
23
24            min = Math.min(min, leftOnes + rightZeros);
25        }
26
27        return min;
28    }
29}