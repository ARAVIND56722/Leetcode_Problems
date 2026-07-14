// Last updated: 14/7/2026, 2:15:44 pm
class Solution {
    public int[][] onesMinusZeros(int[][] grid) {

        int m = grid.length;
        int n = grid[0].length;

        int[] onesRow = new int[m];
        int[] onesCol = new int[n];

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    onesRow[i]++;
                    onesCol[j]++;
                }
            }
        }

        int[][] ans = new int[m][n];

        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                int zeroRow = n - onesRow[i];
                int zeroCol = m - onesCol[j];

                ans[i][j] =
                    onesRow[i] + onesCol[j]
                    - zeroRow - zeroCol;
            }
        }

        return ans;
    }
}