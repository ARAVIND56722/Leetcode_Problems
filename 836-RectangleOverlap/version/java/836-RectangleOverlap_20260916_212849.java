// Last updated: 16/9/2026, 9:28:49 pm
1class Solution {
2    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
3        
4        int width = Math.min(rec1[2], rec2[2]) 
5                  - Math.max(rec1[0], rec2[0]);
6
7        int height = Math.min(rec1[3], rec2[3]) 
8                   - Math.max(rec1[1], rec2[1]);
9
10        return width > 0 && height > 0;
11    }
12}
13
14