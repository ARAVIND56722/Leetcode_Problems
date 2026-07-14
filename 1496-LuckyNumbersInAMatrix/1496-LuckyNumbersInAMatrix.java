// Last updated: 14/7/2026, 2:16:20 pm
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> res= new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            int min=matrix[i][0];
            int col=0;
            
            for(int j=0;j<matrix[0].length;j++){
                   if(min>matrix[i][j]){
                    min=matrix[i][j];
                    col=j;
                   }
            }
            int max=matrix[0][col];
            for(int k=0;k<matrix.length;k++){
                if(max<matrix[k][col]){
                    max=matrix[k][col];
                }
            }
            if(max==min){
               res.add(min);
               
            }

        }
        return res;
        
    }
}