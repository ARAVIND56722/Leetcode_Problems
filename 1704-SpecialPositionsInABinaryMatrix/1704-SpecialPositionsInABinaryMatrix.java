// Last updated: 14/7/2026, 2:16:09 pm
class Solution {
    public int numSpecial(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        int onesRow[]=new int[n];
        int onesCol[]=new int[m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(mat[i][j]==1){
                   onesRow[i]++;
                   onesCol[j]++;
                }
            }
        }
        int count=0;
         for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                 if(mat[i][j] == 1 && onesRow[i] == 1 && onesCol[j] == 1) {
                    count++;
                }
            }
         }
         return count;
    }
}