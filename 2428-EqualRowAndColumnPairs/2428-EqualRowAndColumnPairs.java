// Last updated: 14/7/2026, 2:15:51 pm
class Solution {
    public int equalPairs(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            int arr[]=new int[grid.length];
            for(int j=0;j<grid[0].length;j++){
                 arr[j]=grid[i][j];
            }
            for(int j=0;j<grid[0].length;j++){
                boolean found=true;
                for(int k=0;k<grid.length;k++){
                     if(grid[k][j]!=arr[k]){
                        found=false;
                        break;
                     }
                }
                if(found){
                    count++;
                }
            }
        }
        return count;
    }
}