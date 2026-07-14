// Last updated: 14/7/2026, 2:16:49 pm
class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int count = 0;

        for (int i = 0; i <= grid.length - 3; i++) {
            for (int j = 0; j <= grid[0].length - 3; j++) {

                boolean[] seen = new boolean[10];
                boolean valid = true;

            
                for (int r = i; r < i + 3; r++) {
                    for (int c = j; c < j + 3; c++) {
                        int num = grid[r][c];

                        if (num < 1 || num > 9 || seen[num]) {
                            valid = false;
                            break;
                        }

                        seen[num] = true;
                    }
                }

                if (!valid)
                    continue;

            
                if (grid[i][j] + grid[i][j + 1] + grid[i][j + 2] != 15)
                    continue;
                if (grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] != 15)
                    continue;
                if (grid[i + 2][j] + grid[i + 2][j + 1] + grid[i + 2][j + 2] != 15)
                    continue;

                
                if (grid[i][j] + grid[i + 1][j] + grid[i + 2][j] != 15)
                    continue;
                if (grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] != 15)
                    continue;
                if (grid[i][j + 2] + grid[i + 1][j + 2] + grid[i + 2][j + 2] != 15)
                    continue;

            
                if (grid[i][j] + grid[i + 1][j + 1] + grid[i + 2][j + 2] != 15)
                    continue;
                if (grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] != 15)
                    continue;

                count++;
            }
        }

        return count;
    }
}