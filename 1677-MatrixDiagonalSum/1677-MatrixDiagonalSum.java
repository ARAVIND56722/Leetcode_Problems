// Last updated: 14/7/2026, 2:16:11 pm
class Solution {
    public int diagonalSum(int[][] mat) {
        int d1=0;
        int d2=0;
        for(int i=0;i<mat.length;i++){
            d1=d1+mat[i][i];
            d2=d2+mat[i][mat.length-1-i];
           
        }
        int sum=d1+d2;
        if(mat.length%2==1){
             sum=sum-mat[mat.length/2][mat.length/2];
        }
        return sum;
        
    }
}