// Last updated: 20/7/2026, 8:22:07 pm
1class Solution {
2    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
3        int m = grid.length;
4        int n = grid[0].length;
5
6        List<List<Integer>> ans = new ArrayList<>();
7
8        for (int l = 0; l < k; l++) {
9
10            int[][] mat = new int[m][n];
11
12            for (int i = 0; i < m; i++) {
13                for (int j = 0; j < n; j++) {
14
15                    if (j == n - 1) { // last column
16
17                        if (i == m - 1) { // last element
18                            mat[0][0] = grid[i][j];
19                        } else { // move to first column of next row
20                            mat[i + 1][0] = grid[i][j];
21                        }
22
23                    } else { // normal element
24                        mat[i][j + 1] = grid[i][j];
25                    }
26                }
27            }
28
29            grid = mat;   // <-- Important
30        }
31
32        for (int i = 0; i < grid.length; i++) {
33            List<Integer> row = new ArrayList<>();
34            for (int j = 0; j < grid[0].length; j++) {
35                row.add(grid[i][j]);
36            }
37            ans.add(row);
38        }
39
40        return ans;
41    }
42}