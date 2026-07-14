// Last updated: 14/7/2026, 2:17:00 pm
class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int result=r*c;
        int original=mat[0].length * mat.length;
        int res[][]=new int[r][c];
        int row=0;
        int col=0;
        if(result==original){
            for(int i=0;i<mat.length;i++){
                
                for(int j=0;j<mat[0].length;j++){
                     res[row][col]=mat[i][j];
                     col++;
                     if(col==c){
                        col=0;
                        row++;
                     }
                }
            
            }
            return res;
        }
        return mat;
        
    }
}