// Last updated: 31/8/2026, 8:13:02 pm
1class Solution {
2    public int myAtoi(String s) {
3
4        int i = 0;
5        int n = s.length();
6
7     
8        while (i < n && s.charAt(i) == ' ') {
9            i++;
10        }
11
12        
13        int sign = 1;
14
15        if (i < n && s.charAt(i) == '-') {
16            sign = -1;
17            i++;
18        } else if (i < n && s.charAt(i) == '+') {
19            i++;
20        }
21
22       
23        int num = 0;
24
25        while (i < n && Character.isDigit(s.charAt(i))) {
26
27            int digit = s.charAt(i) - '0';
28
29            
30            if (num > (Integer.MAX_VALUE - digit) / 10) {
31                if (sign == 1) {
32                    return Integer.MAX_VALUE;
33                } else {
34                    return Integer.MIN_VALUE;
35                }
36            }
37
38            num = num * 10 + digit;
39            i++;
40        }
41
42        return num * sign;
43    }
44}