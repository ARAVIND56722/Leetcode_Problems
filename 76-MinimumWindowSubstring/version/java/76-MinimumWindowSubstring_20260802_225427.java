// Last updated: 2/8/2026, 10:54:27 pm
1class Solution {
2    public String minWindow(String s, String t) {
3
4        if (s.length() < t.length()) {
5            return "";
6        }
7
8        HashMap<Character, Integer> need = new HashMap<>();
9        HashMap<Character, Integer> window = new HashMap<>();
10
11        // Store frequency of characters in t
12        for (char c : t.toCharArray()) {
13            need.put(c, need.getOrDefault(c, 0) + 1);
14        }
15
16        int required = need.size();
17        int formed = 0;
18
19        int left = 0;
20        int minLen = Integer.MAX_VALUE;
21        int start = 0;
22
23        for (int right = 0; right < s.length(); right++) {
24
25            char c = s.charAt(right);
26            window.put(c, window.getOrDefault(c, 0) + 1);
27
28            // Check if this character now satisfies the required frequency
29            if (need.containsKey(c) &&
30                window.get(c).intValue() == need.get(c).intValue()) {
31                formed++;
32            }
33
34            // Try to shrink the window
35            while (formed == required) {
36
37                if (right - left + 1 < minLen) {
38                    minLen = right - left + 1;
39                    start = left;
40                }
41
42                char leftChar = s.charAt(left);
43                window.put(leftChar, window.get(leftChar) - 1);
44
45                if (need.containsKey(leftChar) &&
46                    window.get(leftChar) < need.get(leftChar)) {
47                    formed--;
48                }
49
50                left++;
51            }
52        }
53
54        return minLen == Integer.MAX_VALUE
55                ? ""
56                : s.substring(start, start + minLen);
57    }
58}